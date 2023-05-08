package com.itheima.service.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * ClassName: EmpServiceA
 * Package: com.itheima.service.impl
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/4/30 16:38
 * @Version: 1.0
 */
//@Component
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empMapper.listEmp();
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
