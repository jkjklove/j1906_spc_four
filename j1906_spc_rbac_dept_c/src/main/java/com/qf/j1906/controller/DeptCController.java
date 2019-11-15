package com.qf.j1906.controller;

import com.qf.j1906.pojo.Dept;
import com.qf.j1906.service.DeptCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
public class DeptCController {
    @Autowired
    private DeptCService deptCService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public String showAll(Model model){
        List<Dept> depts = deptCService.findDepts();
        model.addAttribute("depts",depts);
        return "depts";
    }

    @RequestMapping(value = "/add")
    public String add(){
        return "add";
    }
    @RequestMapping(value = "/dept",method = RequestMethod.POST)
    public String addDept(Dept dept,Model model){
        Dept dept1 = deptCService.addDept(dept);
        model.addAttribute("dept",dept);
        return "redirect:/depts";
    }

    @RequestMapping(value = "/update")
    public String update(){
        return "update";
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity updateDept(Dept dept, Model model){
        Dept dept1 = deptCService.updateById(dept);
        model.addAttribute("dept", dept);
        return new ResponseEntity(HttpStatus.OK);
    }
}
