package com.ycf.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

/**
 * 冷库情况调查实体类
 */
public class StorageResearch {
	//序号
	@Excel(name="序号",isImportField = "true_st")
	private String id;
	//运营时间
	@Excel(name="运营时间(年)",isImportField = "true_st")
	private String operationTime;
	//冷库容量
	@Excel(name="冷库容量(吨)",isImportField = "true_st")
	private String storageContent;
	//冷库占地面积
	@Excel(name="冷库占地面积",isImportField = "true_st")
	private String floorSpace;
	//地址
	@Excel(name="地址",isImportField = "true_st")
	private String address;
	//公司名称
	@Excel(name="公司名称",isImportField = "true_st")
	private String company;
	//就业人数
	@Excel(name="就业人数",isImportField = "true_st")
	private String employmentCount;
	//交易额
	@Excel(name="交易额(万元)",isImportField = "true_st")
	private String tradeNum;
	//纳税额
	@Excel(name="纳税额(万元)",isImportField = "true_st")
	private String ratal;
	//注册资本
	@Excel(name="注册资本(万元)",isImportField = "true_st")
	private String registerNum;
	//联系人
	@Excel(name="联系人",isImportField = "true_st")
	private String linkman;
	//手机号
	@Excel(name="手机号",isImportField = "true_st")
	private String phone;
	//备注
	@Excel(name="备注",isImportField = "true_st")
	private String remark;
	//填报单位
	@Excel(name="填报单位",isImportField = "true_st")
	private String reportCompany;
	//填报时间
	@Excel(name="填报时间",isImportField = "true_st")
	private String reportTime;
	//填报人
	@Excel(name="填报人",isImportField = "true_st")
	private String reportPeople;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public String getStorageContent() {
		return storageContent;
	}

	public void setStorageContent(String storageContent) {
		this.storageContent = storageContent;
	}

	public String getFloorSpace() {
		return floorSpace;
	}

	public void setFloorSpace(String floorSpace) {
		this.floorSpace = floorSpace;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmploymentCount() {
		return employmentCount;
	}

	public void setEmploymentCount(String employmentCount) {
		this.employmentCount = employmentCount;
	}

	public String getTradeNum() {
		return tradeNum;
	}

	public void setTradeNum(String tradeNum) {
		this.tradeNum = tradeNum;
	}

	public String getRatal() {
		return ratal;
	}

	public void setRatal(String ratal) {
		this.ratal = ratal;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReportCompany() {
		return reportCompany;
	}

	public void setReportCompany(String reportCompany) {
		this.reportCompany = reportCompany;
	}

	public String getReportTime() {
		return reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportPeople() {
		return reportPeople;
	}

	public void setReportPeople(String reportPeople) {
		this.reportPeople = reportPeople;
	}
}
