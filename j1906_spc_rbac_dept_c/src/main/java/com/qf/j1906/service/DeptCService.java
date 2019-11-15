package com.qf.j1906.service;

import com.qf.j1906.pojo.Dept;

import java.util.List;

/**
 * dept对象操作方法的业务逻辑层接口(消费者)
 */
public interface DeptCService {
    //查询所有dept对象详细信
    public List<Dept> findDepts();
    //添加一个dept对象
    public Dept addDept(Dept dept);
    //根据id修改dept对象
    public Dept updateById(Dept dept);
}
