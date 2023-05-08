package com.itheima.config;

import com.itheima.service.DeptService;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: CommonConfig
 * Package: com.itheima.config
 * Description:
 *
 * @Author Shuo
 * @Create 2023/5/8 16:32
 * @Version 1.0
 */
@Configuration
public class CommonConfig {
    //声明第三方Bean
    @Bean
    public SAXReader saxReader(DeptService deptService){
        return new SAXReader();
    }
}
