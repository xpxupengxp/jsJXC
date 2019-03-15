package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 * 物料出厂信息
 */
public class MaterialFactoryInformation implements Serializable {
    private Long mRealId;//物料实物ID

    private String manufacturerName;//生产厂家

    private Date manufactureDate;//生产日期

    private String manufactureBatch;//生产批次

    private String expirationDate;//失效日期

    private String qualityGrade;//出厂等级

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName == null ? null : manufacturerName.trim();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureBatch() {
        return manufactureBatch;
    }

    public void setManufactureBatch(String manufactureBatch) {
        this.manufactureBatch = manufactureBatch == null ? null : manufactureBatch.trim();
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate == null ? null : expirationDate.trim();
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = qualityGrade == null ? null : qualityGrade.trim();
    }
}