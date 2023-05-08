package com.itheima;

import com.google.gson.Gson;
import com.itheima.controller.DeptController;
import com.itheima.pojo.Result;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.UUID;

@SpringBootTest
class TliasWebManagementApplicationTests {

    @Test
    public void testUuid() {
        for (int i = 0; i < 1000; i++) {
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }


    @Autowired
    private ApplicationContext applicationContext;// IOC容器对象

    @Test
    public void testGetBean() {
        DeptController bean1 = (DeptController) applicationContext.getBean("deptController");
        System.out.println(bean1);

        DeptController bean2 = applicationContext.getBean(DeptController.class);
        System.out.println(bean2);

        DeptController bean3 = applicationContext.getBean("deptController", DeptController.class);
        System.out.println(bean3);

    }

    @Test
    public void testScope() {
        for (int i = 0; i < 10; i++) {
            DeptController deptController = applicationContext.getBean(DeptController.class);
            System.out.println(deptController);
        }
    }

    @Autowired
    private SAXReader saxReader;
    @Test
    public void testThirdBean() throws Exception {
//        SAXReader saxReader = new SAXReader();

        Document document = saxReader.read(this.getClass().getClassLoader().getResource("1.xml"));
        Element rootElement = document.getRootElement();
        String name = rootElement.element("name").getText();
        String age = rootElement.element("age").getText();

        System.out.println(name + " : " + age);
    }

    @Test
    public void testGetBean2(){
        Object saxReader = applicationContext.getBean("reader");
        System.out.println(saxReader);
    }

    @Autowired
    private Gson gson;
    @Test
    public void testJson(){
        String json = gson.toJson(Result.success());
        System.out.println(json);
    }

//    @Test
//    public void testTokenParser(){
//        System.out.println(applicationContext.getBean(TokenParser.class));
//    }
}
