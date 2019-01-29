package com.faraway.eurekaconsumerdeptribbon.service;

import com.faraway.common.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/24 17:48
 */
@Service
public class RibbonDeptService {

    private static final String REST_URL_PREFIX = "http://eureka-provider-dept";

    @Autowired
    private RestTemplate restTemplate;

    public List<Dept> getDeptList(){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/getDeptList",null, List.class);
    }
}
