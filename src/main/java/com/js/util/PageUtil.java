package com.js.util;

public class PageUtil {
    private int page = 1;//当前页码
    private int rows;//每页条数
    private int totalRows;//总数量
    private String orderBy;//排序字段
    private String order;//排序（ASC、DESC）
    private String sort;


    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public PageUtil() {
    }

    public int getStart() {
        return (this.page - 1) * this.rows;
    }

    public int getEnd() {
        return this.page * this.rows;
    }

    public int getPageTotal() {
        return this.totalRows == 0 ? 0 : this.totalRows / this.rows + (this.totalRows % this.rows == 0 ? 0 : 1);
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        if (page >= 1) {
            this.page = page;
        }

    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        if (rows >= 1) {
            this.rows = rows;
        }

    }

    public int getTotalRows() {
        return this.totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

}
