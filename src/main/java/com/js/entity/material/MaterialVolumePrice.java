package com.js.entity.material;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 物料量价
 */
public class MaterialVolumePrice implements Serializable {
    private Long mRealId;//物料实物ID

    private BigDecimal mUnitPrice;//单价

    private BigDecimal mNumber;//数量

    private Integer mWholeQuantity;//整量

    private Integer mRemainder;//零头

    private BigDecimal mValue;//价值

    private String mCurrency;//货币

    private String mUnit;//单位

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public BigDecimal getmUnitPrice() {
        return mUnitPrice;
    }

    public void setmUnitPrice(BigDecimal mUnitPrice) {
        this.mUnitPrice = mUnitPrice;
    }

    public BigDecimal getmNumber() {
        return mNumber;
    }

    public void setmNumber(BigDecimal mNumber) {
        this.mNumber = mNumber;
    }

    public Integer getmWholeQuantity() {
        return mWholeQuantity;
    }

    public void setmWholeQuantity(Integer mWholeQuantity) {
        this.mWholeQuantity = mWholeQuantity;
    }

    public Integer getmRemainder() {
        return mRemainder;
    }

    public void setmRemainder(Integer mRemainder) {
        this.mRemainder = mRemainder;
    }

    public BigDecimal getmValue() {
        return mValue;
    }

    public void setmValue(BigDecimal mValue) {
        this.mValue = mValue;
    }

    public String getmCurrency() {
        return mCurrency;
    }

    public void setmCurrency(String mCurrency) {
        this.mCurrency = mCurrency == null ? null : mCurrency.trim();
    }

    public String getmUnit() {
        return mUnit;
    }

    public void setmUnit(String mUnit) {
        this.mUnit = mUnit == null ? null : mUnit.trim();
    }
}