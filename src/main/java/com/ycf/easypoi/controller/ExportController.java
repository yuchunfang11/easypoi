/*
package com.ycf.easypoi.controller;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.entity.vo.TemplateExcelConstants;
import cn.afterturn.easypoi.excel.ExcelXorHtmlUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.view.PoiBaseView;
import com.ycf.easypoi.entity.MsgClient;
import com.ycf.easypoi.entity.StudentInfo;
import com.ycf.easypoi.entity.TemplateExcelExportEntity;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

@Controller
public class ExportController {

	@RequestMapping("/exportlist")
	public String exportList() {
		return "exportlist";
	}
}

	@RequestMapping("/singleExport")
	public void singleExport(ModelMap map, HttpServletRequest request,
									  HttpServletResponse response) {
		List<MsgClient> list = new ArrayList<MsgClient>();
		for (int i = 0; i < 100; i++) {
			MsgClient client = new MsgClient();
			client.setBirthday(new Date());
			client.setClientName("小明" + i);
			client.setClientPhone("18797" + i);
			client.setCreateBy("JueYue");
			client.setId("1" + i);
			client.setRemark("测试" + i);
			list.add(client);
		}
		ExportParams params = new ExportParams("2412312", "测试", ExcelType.XSSF);
		params.setFreezeCol(2);
		map.put(NormalExcelConstants.DATA_LIST, list);
		map.put(NormalExcelConstants.CLASS, MsgClient.class);
		map.put(NormalExcelConstants.PARAMS, params);
		PoiBaseView.render(map, request, response, NormalExcelConstants.EASYPOI_EXCEL_VIEW);
	}

	@RequestMapping("/templetExport")
	public void templetExport(ModelMap modelMap, HttpServletRequest request,
							  HttpServletResponse response) {
		TemplateExportParams params = new TemplateExportParams(
				"doc/人像摄影表.xls");
		Map<String, Object> map = new HashMap<String, Object>();
		modelMap.put(TemplateExcelConstants.FILE_NAME, "人像摄影表");
		modelMap.put(TemplateExcelConstants.PARAMS, params);
		modelMap.put(TemplateExcelConstants.MAP_DATA, map);
		PoiBaseView.render(modelMap, request, response,
				TemplateExcelConstants.EASYPOI_TEMPLATE_EXCEL_VIEW);
	}

	*/
/*@RequestMapping("/templetExport")
	public void templetExport(ModelMap modelMap, HttpServletRequest request,
									  HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		TemplateExportParams params = new TemplateExportParams(
				"doc/foreach.xlsx");
		List<TemplateExcelExportEntity> list = new ArrayList<TemplateExcelExportEntity>();

		for (int i = 0; i < 4; i++) {
			TemplateExcelExportEntity entity = new TemplateExcelExportEntity();
			entity.setIndex(i + 1 + "");
			entity.setAccountType("开源项目");
			entity.setProjectName("EasyPoi " + i + "期");
			entity.setAmountApplied(i * 10000 + "");
			entity.setApprovedAmount((i + 1) * 10000 - 100 + "");
			list.add(entity);
		}
		map.put("entitylist", list);
		map.put("manmark", "1");
		map.put("letest", "12345678");
		map.put("fntest", "12345678.2341234");
		map.put("fdtest", null);
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 1; i++) {
			Map<String, Object> testMap = new HashMap<String, Object>();
			testMap.put("id", "xman");
			testMap.put("name", "小明" + i);
			testMap.put("sex", "1");
			mapList.add(testMap);
		}
		map.put("maplist", mapList);

		mapList = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 6; i++) {
			Map<String, Object> testMap = new HashMap<String, Object>();

			testMap.put("si", "xman");
			mapList.add(testMap);
		}
		map.put("sitest", mapList);
		modelMap.put(TemplateExcelConstants.FILE_NAME, "用户信息");
		modelMap.put(TemplateExcelConstants.PARAMS, params);
		modelMap.put(TemplateExcelConstants.MAP_DATA, map);
		PoiBaseView.render(modelMap, request, response,
				TemplateExcelConstants.EASYPOI_TEMPLATE_EXCEL_VIEW);

	}*//*




	@RequestMapping("/htmlExport")
	public void htmlExport(ModelMap modelMap, HttpServletRequest request,
							  HttpServletResponse response) {
		try {
			response.setContentType("application/vnd.ms-excel;charset=utf-8");
			response.setHeader("Content-Disposition", "attachment;filename="+ new String(( "123.xls").getBytes(), "iso-8859-1"));
			Workbook workbook = ExcelXorHtmlUtil.htmlToExcel(getClass().getResourceAsStream("/templates/exportList.html"), ExcelType.XSSF);
			OutputStream outputStream =  response.getOutputStream();
			workbook.write(outputStream);
		}catch (IOException e){
			e.printStackTrace();;
		}
	}


}
*/
