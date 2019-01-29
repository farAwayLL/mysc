package com.faraway.eurekaproviderdept.service;

import com.faraway.common.entity.Dept;
import com.faraway.common.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/24 16:54
 */
@Service
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> getDeptList() {
        return deptMapper.getDeptList();
    }
}
