package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.DeptMapper;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.pojo.DeptExample;
import com.qf.j1906.service.DeptPService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("deptPService")
public class DeptPServiceImpl implements DeptPService {
    @Resource
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findDepts() {
        DeptExample example = new DeptExample();
        List<Dept> depts = deptMapper.selectByExample(example);
        return depts;
    }

    @Override
    public Dept insert(Dept dept) {
        int i = deptMapper.insert(dept);
        if (i > 0){
            return dept;
        }
        return null;
    }

    @Override
    public Dept updateDept(Dept dept) {
        int i = deptMapper.updateByPrimaryKey(dept);
        if ( i > 0){
            return dept;
        }
        return null;
    }
}
