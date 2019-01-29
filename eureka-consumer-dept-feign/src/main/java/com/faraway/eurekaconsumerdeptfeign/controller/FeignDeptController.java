package com.faraway.eurekaconsumerdeptfeign.controller;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaconsumerdeptfeign.service.FeignDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/25 10:25
 */
@RestController
@RequestMapping("/feign/dept")
public class FeignDeptController {

    @Autowired
    private FeignDeptService deptService;

    @PostMapping("/getDeptList")
    public List<Dept> getDeptList(){
        return deptService.getDeptList();
    }
}
