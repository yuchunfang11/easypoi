package com.ycf.easypoi.controller;

import cn.afterturn.easypoi.entity.vo.TemplateExcelConstants;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.view.PoiBaseView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 导出excel模板，（共25个模板）
 */
@Controller
public class ExportTempletController {
	private static Logger log  = LoggerFactory.getLogger(ExportTempletController.class);

	@RequestMapping("/rxsytemplet")
	public void rxsyTemplet(ModelMap modelMap, HttpServletRequest request,
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
	@RequestMapping("/templetExport")
	public void ccqyeTmplet(ModelMap modelMap, HttpServletRequest request,
							  HttpServletResponse response,@RequestParam String name) {
		TemplateExportParams params = new TemplateExportParams(
				"doc/"+name+".xls");
		Map<String, Object> map = new HashMap<String, Object>();
		modelMap.put(TemplateExcelConstants.FILE_NAME, name);
		modelMap.put(TemplateExcelConstants.PARAMS, params);
		modelMap.put(TemplateExcelConstants.MAP_DATA, map);
		PoiBaseView.render(modelMap, request, response,
				TemplateExcelConstants.EASYPOI_TEMPLATE_EXCEL_VIEW);
		log.info(name+"模板下载成功");

	}



}
