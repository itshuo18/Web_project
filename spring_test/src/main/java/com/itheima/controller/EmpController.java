package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: EmpController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/4/29 15:03
 * @Version: 1.0
 */
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }
}


//    String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//    List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        empList.stream().forEach(emp->{
//        String gender = emp.getGender();
//        if("1".equals(gender)){
//            emp.setGender("男");
//        }
//        else if("2".equals(gender)){
//            emp.setGender("女");
//        }
//
//        String job = emp.getJob();
//        if("1".equals(job)){
//            emp.setGender("讲师");
//        }
//        else if("2".equals(job)){
//            emp.setGender("班主任");
//        }
//        else if("3".equals(job)){
//            emp.setGender("就业指导");
//        }
//
//    });
//        return Result.success(empList);
//}
