package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 *包装处置
 */
public class MaterialPackagingDisposal implements Serializable {
    private Long mRealId;//物料实物ID

    private Byte isRepackaging;//是否需要包装

    private String packer;//打包人员

    private Date timeLimit;//时间限制

    private String disposalResult;//处置结果

    private String memo;//备注

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public Byte getIsRepackaging() {
        return isRepackaging;
    }

    public void setIsRepackaging(Byte isRepackaging) {
        this.isRepackaging = isRepackaging;
    }

    public String getPacker() {
        return packer;
    }

    public void setPacker(String packer) {
        this.packer = packer == null ? null : packer.trim();
    }

    public Date getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Date timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getDisposalResult() {
        return disposalResult;
    }

    public void setDisposalResult(String disposalResult) {
        this.disposalResult = disposalResult == null ? null : disposalResult.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}