package com.yutao.shi;

import com.yutao.shi.dao.Daoimpl;
import com.yutao.shi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * @author shiyutao
 * @create 2021-11-21 17:45
 */
@Controller
public class controller {
    @Autowired
    private Daoimpl employeedao;

    @GetMapping(value = "/employee")
    public ModelAndView employee() {
        Collection<Employee> all = employeedao.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("all", all);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @DeleteMapping(value = "/employee/{id}")
    public String delete(@PathVariable("id") Integer id) {
        employeedao.delete(id);
        return "redirect:/employee";

    }

    @PostMapping(value = "/employee")
    public String add(Employee employee) {
        employeedao.save(employee);
        return "redirect:/employee";


    }

    @GetMapping(value = "/employee/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeedao.get(id);
        model.addAttribute("employee", employee);
        return "update";
    }

    @PutMapping(value = "/employee")
    public String update1(Employee employee) {
        employeedao.save(employee);
        return "redirect:/employee";
    }
}