package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 * 质量等级
 */
public class MaterialQuality implements Serializable {
    private Long mRealId;//物料实物ID

    private String cResult;//检验结果

    private String cIsinspection;//是否检验

    private String cInspectionGrade;//检验等级

    private String cInspector;//检验人员

    private Date cInspectionDate;//检验日期

    private String cInspectionMemo;//备注

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public String getcResult() {
        return cResult;
    }

    public void setcResult(String cResult) {
        this.cResult = cResult == null ? null : cResult.trim();
    }

    public String getcIsinspection() {
        return cIsinspection;
    }

    public void setcIsinspection(String cIsinspection) {
        this.cIsinspection = cIsinspection == null ? null : cIsinspection.trim();
    }

    public String getcInspectionGrade() {
        return cInspectionGrade;
    }

    public void setcInspectionGrade(String cInspectionGrade) {
        this.cInspectionGrade = cInspectionGrade == null ? null : cInspectionGrade.trim();
    }

    public String getcInspector() {
        return cInspector;
    }

    public void setcInspector(String cInspector) {
        this.cInspector = cInspector == null ? null : cInspector.trim();
    }

    public Date getcInspectionDate() {
        return cInspectionDate;
    }

    public void setcInspectionDate(Date cInspectionDate) {
        this.cInspectionDate = cInspectionDate;
    }

    public String getcInspectionMemo() {
        return cInspectionMemo;
    }

    public void setcInspectionMemo(String cInspectionMemo) {
        this.cInspectionMemo = cInspectionMemo == null ? null : cInspectionMemo.trim();
    }
}