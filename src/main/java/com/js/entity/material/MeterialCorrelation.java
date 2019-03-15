package com.js.entity.material;

import java.io.Serializable;

/**
 * 物料关联
 */
public class MeterialCorrelation implements Serializable {
    private Long mRealId;//物料实物ID

    private Long orderId;//销售订单ID

    private Long purchaseOrderId;//采购单ID

    private Long outsourcingOrders;//委外订单ID

    private Long productiveTaskOrder;//生产任务单ID

    private Long purchaseInboundOrderId;//外购入库单ID

    private Long outsourcingInboundOrderId;//委外入库单ID

    private Long productInboundOrderId;//产品入库ID

    private Long materialOutboundOrderId;//物料出库单ID

    private Long outsourcingOutboundOrderId;//委外出库单ID

    private Long orderOutboundId;//销售出库单ID

    private Long distributionSheet;//配送单ID

    private Long supplierOutboundOrderId;//供应商出库单ID

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getOutsourcingOrders() {
        return outsourcingOrders;
    }

    public void setOutsourcingOrders(Long outsourcingOrders) {
        this.outsourcingOrders = outsourcingOrders;
    }

    public Long getProductiveTaskOrder() {
        return productiveTaskOrder;
    }

    public void setProductiveTaskOrder(Long productiveTaskOrder) {
        this.productiveTaskOrder = productiveTaskOrder;
    }

    public Long getPurchaseInboundOrderId() {
        return purchaseInboundOrderId;
    }

    public void setPurchaseInboundOrderId(Long purchaseInboundOrderId) {
        this.purchaseInboundOrderId = purchaseInboundOrderId;
    }

    public Long getOutsourcingInboundOrderId() {
        return outsourcingInboundOrderId;
    }

    public void setOutsourcingInboundOrderId(Long outsourcingInboundOrderId) {
        this.outsourcingInboundOrderId = outsourcingInboundOrderId;
    }

    public Long getProductInboundOrderId() {
        return productInboundOrderId;
    }

    public void setProductInboundOrderId(Long productInboundOrderId) {
        this.productInboundOrderId = productInboundOrderId;
    }

    public Long getMaterialOutboundOrderId() {
        return materialOutboundOrderId;
    }

    public void setMaterialOutboundOrderId(Long materialOutboundOrderId) {
        this.materialOutboundOrderId = materialOutboundOrderId;
    }

    public Long getOutsourcingOutboundOrderId() {
        return outsourcingOutboundOrderId;
    }

    public void setOutsourcingOutboundOrderId(Long outsourcingOutboundOrderId) {
        this.outsourcingOutboundOrderId = outsourcingOutboundOrderId;
    }

    public Long getOrderOutboundId() {
        return orderOutboundId;
    }

    public void setOrderOutboundId(Long orderOutboundId) {
        this.orderOutboundId = orderOutboundId;
    }

    public Long getDistributionSheet() {
        return distributionSheet;
    }

    public void setDistributionSheet(Long distributionSheet) {
        this.distributionSheet = distributionSheet;
    }

    public Long getSupplierOutboundOrderId() {
        return supplierOutboundOrderId;
    }

    public void setSupplierOutboundOrderId(Long supplierOutboundOrderId) {
        this.supplierOutboundOrderId = supplierOutboundOrderId;
    }
}