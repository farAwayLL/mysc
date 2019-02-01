package com.faraway.eurekaconsumerdeptfeignaddsentinel.fallback;

import com.faraway.common.entity.Dept;
import com.faraway.eurekaconsumerdeptfeignaddsentinel.service.FeignDeptService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author faraway
 * @date 2019/1/25 14:45
 */
@Component
public class FeignDeptServiceSentinel implements FeignDeptService {
    @Override
    public List<Dept> getDeptList() {
        List<Dept> deptList = new ArrayList<>();
        Dept dept = new Dept();
        dept.setDeptName("nullList");
        dept.setDbSource("nullList");
        dept.setDeptNo(500L);
        deptList.add(dept);
        return deptList;
    }
}
