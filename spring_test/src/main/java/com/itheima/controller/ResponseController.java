package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ResponseController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/4/28 16:46
 * @Version: 1.0
 */
//@RestController
//public class ResponseController {
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//        return addr;
//    }
//
//
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> list = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//
//        Address addr2 = new Address();
//        addr.setProvince("黑龙江");
//        addr.setCity("哈尔滨");
//
//        list.add(addr);
//        list.add(addr2);
//        return list;
//    }
//}


@RestController
public class ResponseController {
    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }



    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr.setProvince("黑龙江");
        addr.setCity("哈尔滨");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
