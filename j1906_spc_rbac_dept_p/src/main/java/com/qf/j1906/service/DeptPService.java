package com.qf.j1906.service;

import com.qf.j1906.pojo.Dept;

import java.util.List;

/**
 * dept对象操方法的业务逻辑层接口（生产者）
 */
public interface DeptPService {
    //查询所有dept对象详细信息
    public List<Dept> findDepts();
    //添加一个dept对象
    public Dept insert(Dept dept);
    //修改一个dept对象
    public Dept updateDept(Dept dept);
}
