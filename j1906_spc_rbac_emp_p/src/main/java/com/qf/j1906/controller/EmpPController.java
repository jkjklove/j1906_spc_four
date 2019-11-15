package com.qf.j1906.controller;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpPService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class EmpPController {
    @Autowired
    private EmpPService empPService;
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public Emp addEmp(@RequestBody Emp emp){
        log.info(emp.toString());
        Emp emp1 = empPService.insertEmp(emp);
        return emp1;
    }
}
