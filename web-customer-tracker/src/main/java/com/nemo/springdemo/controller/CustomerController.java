package com.nemo.springdemo.controller;

import com.nemo.springdemo.dao.CustomerDAO;
import com.nemo.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerDAO.getCustomers();
        model.addAttribute("customers", customerList);
        return "list-customers";
    }
}
