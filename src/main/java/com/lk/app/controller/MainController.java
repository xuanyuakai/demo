package com.lk.app.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lk.app.dao.mapper.EmployeeMapper;
import com.lk.app.dao.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/demo")
    public Object demo(){
        System.out.println("springBoot项目创建成功！");
        List<Employee> employees = employeeMapper.selectList(new QueryWrapper<Employee>());
        System.out.println(employees);
        return employees;
    }
}
