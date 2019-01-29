package com.faraway.eurekaconsumerdeptribbonaddhystrix.controller;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaconsumerdeptribbonaddhystrix.service.RibbonDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/25 10:56
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
