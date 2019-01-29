package com.faraway.eurekaconsumerdeptfeignaddhystrix.service;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaconsumerdeptfeignaddhystrix.fallback.FeignDeptServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author faraway
 * @date 2019/1/25 10:21
 */
@FeignClient(value = "eureka-provider-dept",fallback = FeignDeptServiceHystrix.class)
public interface FeignDeptService {

    @PostMapping("/dept/getDeptList")
    List<Dept> getDeptList();

}
