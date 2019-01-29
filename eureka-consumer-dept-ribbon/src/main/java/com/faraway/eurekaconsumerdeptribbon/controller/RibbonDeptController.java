package com.faraway.eurekaconsumerdeptribbon.controller;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaconsumerdeptribbon.service.RibbonDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/24 17:47
 */
@RestController
@RequestMapping("/ribbon/dept")
public class RibbonDeptController {

    @Autowired
    private RibbonDeptService deptService;

    @PostMapping("/getDeptList")
    public List<Dept> getDeptList(){
        return deptService.getDeptList();
    }
}
