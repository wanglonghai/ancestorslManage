package com.ancestors.manage.controller;
import com.ancestors.manage.entity.TestEntity;
import com.ancestors.manage.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName TestController
 * @Author Gavin
 * @Date 2021/2/19 8:53
 * @Description 描述
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    @ResponseBody
    @GetMapping("/get/{id}")
    public String test(@PathVariable(value = "id") Integer id){
        TestEntity testEntity=testService.getEntity(id);
        return testEntity!=null?testEntity.toString():"data not found";
    }
}
