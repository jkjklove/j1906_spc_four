package com.qf.j1906;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    private EmpPService empPService;
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public Emp addEmp(@RequestBody Emp emp){
        Emp emp1 = empPService.insertEmp(emp);
        return emp1;
    }
}
