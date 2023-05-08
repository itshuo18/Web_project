package com.itheima;

import com.example.EnableHeaderConfig;
import com.example.HeaderParser;
import com.example.MyImportSelector;
import com.example.TokenParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ServletComponentScan
//@ComponentScan({"com.example","com.itheima"})
//@Import({TokenParser.class}) // 导入普通类
//@Import({HeaderParser.class}) // 导入配置类
//@Import({MyImportSelector.class}) // 导入ImportSelector接口实现类
@EnableHeaderConfig
@SpringBootApplication
public class TliasWebManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasWebManagementApplication.class, args);
    }

}
