package com.ycf.easypoi.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import com.ycf.easypoi.entity.ClassName;
import com.ycf.easypoi.entity.MsgClient;
import com.ycf.easypoi.entity.StatisticEntity;
import com.ycf.easypoi.model.StorageResearch;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class ImportController {
	private static Logger log  = LoggerFactory.getLogger(ImportController.class);

	@Value("${upload_path}")
	private String upload_path;

	@RequestMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file){
		if (file.isEmpty()) {
			return "upload file is empty";
		}
		try {
			byte[] bytes = file.getBytes();
			String fileName = file.getOriginalFilename();
			//IE浏览器上传的文件名为文件全路径，截取文件名
			if (fileName.contains("\\")){
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			}
			File folder = new File(upload_path);
			if(!folder.exists()){
				folder.mkdirs();
			}
			String tempFile = upload_path+"\\"+new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+"_"+fileName;
			Path path =  Paths.get(tempFile);
			Files.write(path, bytes);
			log.info("文件上传成功，上传路径："+tempFile);
			parseExcel(tempFile);
			return "upload success";
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return "upload success";


	}

	/**
	 * 导入Excel
 	 * @param fileName
	 */
	private void parseExcel(String fileName){
		try{
			ImportParams params = new ImportParams();
			params.setHeadRows(4);
			long start = new Date().getTime();
			List<StorageResearch> list = ExcelImportUtil.importExcel(
					new File(fileName), StorageResearch.class, params);
			log.info("excel文件："+fileName+"解析成功");
			log.info("数据条数："+list.size());
			log.info(ReflectionToStringBuilder.toString(list.get(0)));;
		}catch (Exception e){
			e.printStackTrace();
		}


	}
}
