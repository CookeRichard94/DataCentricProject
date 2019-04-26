package com.sales.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Loan;
import com.sales.services.BookService;
import com.sales.services.CustomerService;
import com.sales.services.LoanService;

@Controller
public class LoanController {
	
	@Autowired
    LoanService loanService;
	
	@Autowired
	BookService bookService;
	
	@Autowired 
	CustomerService custService;
    
    @RequestMapping(value = "/showLoans", method = RequestMethod.GET)
    public String getLoans(Model m)
    {
        ArrayList<Loan> loans = loanService.getLoans();
        m.addAttribute("loans", loans);
        return "showLoans";
    }
    
    @RequestMapping(value = "/newLoan", method = RequestMethod.GET)
	public String getLoan(@ModelAttribute("loanAdd") Loan c, HttpServletRequest h) {
		return "newLoan";
	}

}
