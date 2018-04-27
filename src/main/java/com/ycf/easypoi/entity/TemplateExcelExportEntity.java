package com.ycf.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;

import java.io.Serializable;
import java.util.List;

/**
 * 模板导出 测试类
 * @author JueYue
 *   2014年12月26日 上午9:39:13
 */
public class TemplateExcelExportEntity implements Serializable {

    /**
     * 
     */
    private static final long          serialVersionUID = 1L;

    @Excel(name = "序号")
    private String                     index;

    @Excel(name = "资金性质")
    private String                     accountType;



    @Excel(name = "项目名称")
    private String                     projectName;

    @Excel(name = "申请金额")
    private String                     amountApplied;

    @Excel(name = "核定金额")
    private String                     approvedAmount;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }



    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getAmountApplied() {
        return amountApplied;
    }

    public void setAmountApplied(String amountApplied) {
        this.amountApplied = amountApplied;
    }

    public String getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(String approvedAmount) {
        this.approvedAmount = approvedAmount;
    }

}