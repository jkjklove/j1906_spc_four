package com.qf.j1906.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class DeptCServiceImpl implements DeptCService {
    @Autowired
    private RestTemplate restTemplate;
    //当远程访问失败时调用fallbackMethod指定的方法
    @HystrixCommand(fallbackMethod = "findDeptsError")
    @Override
    public List<Dept> findDepts() {
        Dept[] depts = restTemplate.getForObject("http://SERVICE-DEPT-P/depts", Dept[].class);
        List<Dept> depts1 = Arrays.asList(depts);
        return depts1;
    }
    public List<Dept> findDeptsError(){
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(100,"zhangsan","xi'an"));
        return depts;
    }

    @HystrixCommand(fallbackMethod = "addDeptError")
    @Override
    public Dept addDept(Dept dept) {
        Dept dept1 = restTemplate.postForObject("http://SERVICE-DEPT-P/dept", dept, Dept.class);
        return dept1;
    }
    public Dept addDeptError(Dept dept){
        return null;
    }


    @Override
    public Dept updateById(Dept dept) {
        try {
            restTemplate.put("http://SERVICE-DEPT-P/update",dept);
            return dept;
        } catch (RestClientException e) {
            e.printStackTrace();
        }
        return null;
    }
}
