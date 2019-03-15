package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 *物料拆分记录
 */
public class MaterialSplitRecord implements Serializable {
    private Long id;//编号

    private Long mRealId;//物料实物ID

    private Integer splitNum;//拆分后笔数

    private String splitReason;//拆分原因

    private Date splitDate;//操作时间

    private String operator;//操作人员

    private String mSplitIds;//拆分后ID

    private String splitNums;//拆分后数量

    private String memo;//备注

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public Integer getSplitNum() {
        return splitNum;
    }

    public void setSplitNum(Integer splitNum) {
        this.splitNum = splitNum;
    }

    public String getSplitReason() {
        return splitReason;
    }

    public void setSplitReason(String splitReason) {
        this.splitReason = splitReason == null ? null : splitReason.trim();
    }

    public Date getSplitDate() {
        return splitDate;
    }

    public void setSplitDate(Date splitDate) {
        this.splitDate = splitDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getmSplitIds() {
        return mSplitIds;
    }

    public void setmSplitIds(String mSplitIds) {
        this.mSplitIds = mSplitIds == null ? null : mSplitIds.trim();
    }

    public String getSplitNums() {
        return splitNums;
    }

    public void setSplitNums(String splitNums) {
        this.splitNums = splitNums == null ? null : splitNums.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}