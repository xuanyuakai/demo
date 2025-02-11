package com.lk.app.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

@TableName("employee")
public class Employee {

    @TableId("id")
    private BigDecimal id;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("role")
    private String role;

    @TableField("name")
    private String name;

    @TableField("sex")
    private String sex;

    @TableField("operator_id")
    private BigDecimal operatorId;

    @TableField("age")
    private BigDecimal age;

    @TableField("description")
    private String description;

    public BigDecimal getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public BigDecimal getOperatorId() {
        return operatorId;
    }

    public BigDecimal getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setOperatorId(BigDecimal operatorId) {
        this.operatorId = operatorId;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", operatorId=" + operatorId +
                ", age=" + age +
                ", description='" + description + '\'' +
                '}';
    }
}
