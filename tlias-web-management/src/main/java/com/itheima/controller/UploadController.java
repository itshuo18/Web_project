package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.utils.AliOSSUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * ClassName: UploadController
 * Package: com.itheima.controller
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/3 21:13
 * @Version: 1.0
 */
@Slf4j
@RestController
public class UploadController {

    @Autowired
    private AliOSSUtils aliOSSUtils;

    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws IOException {
        log.info("文件上传，文件名：{}",image.getOriginalFilename());
        // 调用阿里云OSS工具类
        String url = aliOSSUtils.upload(image);
        log.info("文件上传完成，文件访问的url：{}", url);

        return Result.success(url);
    }


    // 本地存储
//    @PostMapping("/upload")
//    public Result upload(String username, Integer age, MultipartFile image) throws Exception {
//        log.info("文件上传：{},{},{}", username, age, image);
//
//        String originalFilename = image.getOriginalFilename();
//
//        int index = originalFilename.lastIndexOf(".");
//        String extname = originalFilename.substring(index);
//        String newFileName = UUID.randomUUID().toString() + extname;
//        log.info("新的文件名：{}", newFileName);
//
//        image.transferTo(new File("D:\\image\\" + originalFilename));
//
//        return Result.success();
//    }

}
