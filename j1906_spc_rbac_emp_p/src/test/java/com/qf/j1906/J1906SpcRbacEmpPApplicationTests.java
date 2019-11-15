package com.qf.j1906;

import com.qf.j1906.mapper.EmpMapper;
import com.qf.j1906.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class J1906SpcRbacEmpPApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    @Test
    public void contextLoads() {
        Emp emp = new Emp();
        empMapper.insertEmp(emp);
        emp.setDeptno(1);
        emp.setEname("marry");
        emp.setJob("java devolper");
        emp.setSal(8500.0);

        int i = empMapper.insertEmp(emp);
        log.info("====count:" + i + "ok");
        log.info(emp.toString());
    }

}
