package com.winit.generator.support;

import java.io.Serializable;

public class Sort implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sortKey;

    private String sortDir;

    public Sort() {
        super();
    }

    public Sort(String sortKey, String sortDir) {
        super();
        this.sortKey = sortKey;
        this.sortDir = sortDir;
    }

    public Sort(String sortKey) {
        this.sortKey = sortKey;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public static Sort valueOf(String sortKey) {
        return new Sort(sortKey);
    }

    public static Sort valueOf(String sortKey, String sortDir) {
        return new Sort(sortKey, sortDir);
    }
}
