package com.winit.generator.support;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class SearchObject implements Serializable {

    private static final long serialVersionUID = -1L;

    private List<Sort> sorts = new LinkedList<Sort>();

    private Integer limit;

    private Integer offset;

    /**
     * 是否全部导出
     */
    private boolean exportFull;

    public SearchObject() {
        super();
    }

    public SearchObject(SearchObject so) {
        super();
        this.sorts = so.sorts;
        this.exportFull = so.exportFull;
        this.limit = so.limit;
        this.offset = so.offset;
    }

    public boolean isExportFull() {
        return exportFull;
    }

    public void setExportFull(boolean exportFull) {
        this.exportFull = exportFull;
    }

    public void addSort(Sort sort) {
        sorts.add(sort);
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
