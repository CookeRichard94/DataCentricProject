package com.sales.controllers;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Customer;
import com.sales.services.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
    CustomerService customerService;
	
	@RequestMapping(value = "/showCustomers", method = RequestMethod.GET)
    public String getCustomers(Model m)
    {
        ArrayList<Customer> customers = customerService.getCustomers();
        m.addAttribute("customers", customers);
        return "/showCustomers";
    }
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String getCust(@ModelAttribute("custAdd") Customer c, HttpServletRequest h) {
		return "addCustomer";
	}
}
