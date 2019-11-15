package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
public class DeptPController {
    @Autowired//按类型搜索bean对象，如果需要按照名称搜索，需要借助@Qualified注解
    @Qualifier(value = "deptPService")//按名称注入
    private DeptPService deptPService;
    //查询所有dept对象
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findAll(){
        List<Dept> depts = deptPService.findDepts();
        return depts;
    }
    //添加dept对象
    @RequestMapping(value = "/dept",method = RequestMethod.POST)
    public Dept addDept(@RequestBody Dept dept){
        log.info(dept.toString());
        Dept dept1 = deptPService.insert(dept);
        return dept1;
    }
    //修改dept对象
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Dept updateDept(@RequestBody Dept dept){
        log.info(dept.toString());
        Dept dept1 = deptPService.updateDept(dept);
        return dept1;
    }
}
