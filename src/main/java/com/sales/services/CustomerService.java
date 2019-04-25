package com.sales.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.sales.models.Customer;
import com.sales.repositories.CustomerRepository;



public class CustomerService {
	
	@Autowired
    private CustomerRepository custRep;
    
    public ArrayList<Customer> getCustomers(){
        return (ArrayList<Customer>) custRep.findAll();
    }
    
}