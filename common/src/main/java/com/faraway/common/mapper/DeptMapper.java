package com.faraway.common.mapper;

import com.faraway.common.entity.Dept;

import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptNo);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptNo);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    List<Dept> getDeptList();
}