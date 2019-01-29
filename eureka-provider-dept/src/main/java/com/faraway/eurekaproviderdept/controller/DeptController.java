package com.faraway.eurekaproviderdept.controller;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaproviderdept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/24 16:53
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/getDeptList")
    public List<Dept> getDeptList() {
        List<Dept> deptList = deptService.getDeptList();
        Dept dept = new Dept();
        dept.setDbSource(port);
        dept.setDeptName(port);
        deptList.add(dept);
        return  deptList;
    }
}
