package com.js.entity.material;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 物料清单
 */
public class MaterialList implements Serializable {
    private Long mId;//物料ID

    private Long[] ids;//物料id数组

    private String name;//物料名称

    private String code;//物料编码

    private String mType;//物料型号

    private String mSpecification;//物料规格

    private String category;//类别

    private String mImage;//物料图片

    private String mSound;//声音

    private String purpose;//用途

    private Byte securityValue;//当前安全值

    private String mVideo;//视频

    private String shape;//形态

    private String mQrcode;//二维码

    private String mQrcodeAddr;//二维码地址

    private String memo;//备注

    private String mBarcode;//条码

    private String mBarcodeAddr;//条码地址

    private Byte isAlert;//系统是否报警

    private Integer defaultWarehouseid;//默认仓库

    private BigDecimal mTotal;//物料总数

    private String mVisualData;//视觉数据

    private static final long serialVersionUID = 1L;

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType == null ? null : mType.trim();
    }

    public String getmSpecification() {
        return mSpecification;
    }

    public void setmSpecification(String mSpecification) {
        this.mSpecification = mSpecification == null ? null : mSpecification.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage == null ? null : mImage.trim();
    }

    public String getmSound() {
        return mSound;
    }

    public void setmSound(String mSound) {
        this.mSound = mSound == null ? null : mSound.trim();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public Byte getSecurityValue() {
        return securityValue;
    }

    public void setSecurityValue(Byte securityValue) {
        this.securityValue = securityValue;
    }

    public String getmVideo() {
        return mVideo;
    }

    public void setmVideo(String mVideo) {
        this.mVideo = mVideo == null ? null : mVideo.trim();
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape == null ? null : shape.trim();
    }

    public String getmQrcode() {
        return mQrcode;
    }

    public void setmQrcode(String mQrcode) {
        this.mQrcode = mQrcode == null ? null : mQrcode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getmBarcode() {
        return mBarcode;
    }

    public void setmBarcode(String mBarcode) {
        this.mBarcode = mBarcode == null ? null : mBarcode.trim();
    }

    public Byte getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Byte isAlert) {
        this.isAlert = isAlert;
    }

    public Integer getDefaultWarehouseid() {
        return defaultWarehouseid;
    }

    public void setDefaultWarehouseid(Integer defaultWarehouseid) {
        this.defaultWarehouseid = defaultWarehouseid;
    }

    public BigDecimal getmTotal() {
        return mTotal;
    }

    public void setmTotal(BigDecimal mTotal) {
        this.mTotal = mTotal;
    }

    public String getmVisualData() {
        return mVisualData;
    }

    public String getmQrcodeAddr() {
        return mQrcodeAddr;
    }

    public void setmQrcodeAddr(String mQrcodeAddr) {
        this.mQrcodeAddr = mQrcodeAddr;
    }

    public String getmBarcodeAddr() {
        return mBarcodeAddr;
    }

    public void setmBarcodeAddr(String mBarcodeAddr) {
        this.mBarcodeAddr = mBarcodeAddr;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setmVisualData(String mVisualData) {
        this.mVisualData = mVisualData == null ? null : mVisualData.trim();
    }

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }
}