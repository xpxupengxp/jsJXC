package com.js.entity.warehouse;

import java.io.Serializable;

/**
 * 报警参数形式类（js_warehouse_m_alert_form）
 */
public class WarehouseMAlertForm implements Serializable {
    private Integer id;//编号

    private String alertColor;//颜色

    private String alertSound;//声音文件

    private String alertPicture;//图像文件

    private static final long serialVersionUID = 1L;


    private Integer[] ids;//编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlertColor() {
        return alertColor;
    }

    public void setAlertColor(String alertColor) {
        this.alertColor = alertColor == null ? null : alertColor.trim();
    }

    public String getAlertSound() {
        return alertSound;
    }

    public void setAlertSound(String alertSound) {
        this.alertSound = alertSound == null ? null : alertSound.trim();
    }

    public String getAlertPicture() {
        return alertPicture;
    }

    public void setAlertPicture(String alertPicture) {
        this.alertPicture = alertPicture == null ? null : alertPicture.trim();
    }
}