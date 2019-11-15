package com.qf.j1906.service.impl;

import com.qf.j1906.pojo.Emp;
import com.qf.j1906.service.EmpCService;
import org.springframework.stereotype.Component;

/**
 * 当fegin调用失败时执行此实现
 */

@Component
public class EmpCServiceError implements EmpCService {
    @Override
    public Emp addEmp(Emp emp) {
        emp.setEmpno(-1);
        return emp;
    }
}
