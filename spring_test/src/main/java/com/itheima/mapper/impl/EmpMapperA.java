package com.itheima.mapper.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName: EmpMapperA
 * Package: com.itheima.mapper.impl
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/4/30 16:32
 * @Version: 1.0
 */
@Component
public class EmpMapperA implements EmpMapper {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
