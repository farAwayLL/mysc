package com.faraway.eurekaconsumerdeptribbonaddhystrix.service;

import com.faraway.common.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author faraway
 * @date 2019/1/25 10:52
 */
@Service
public class RibbonDeptService {

    private static final String REST_URL_PREFIX = "http://eureka-provider-dept";

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getDeptListError")
    public List<Dept> getDeptList(){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/getDeptList",null,List.class);
    }

    public List<Dept> getDeptListError(){
        List<Dept> deptList = new ArrayList<>();
        Dept dept = new Dept();
        dept.setDeptName("error");
        dept.setDbSource("error");
        dept.setDeptNo(500L);
        deptList.add(dept);
        return deptList;
    }

}
