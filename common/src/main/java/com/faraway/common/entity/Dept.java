package com.faraway.common.entity;

import java.io.Serializable;

/**
 * dept
 * @author 
 */
public class Dept implements Serializable {
    /**
     * 部门ID
     */
    private Long deptNo;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 所属数据据
     */
    private String dbSource;

    private static final long serialVersionUID = 1L;

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}