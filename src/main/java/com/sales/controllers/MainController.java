package com.sales.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sales.models.Book;
import com.sales.services.BookService;

@Controller
public class MainController
{
    @Autowired
    BookService bookService;
    
    @RequestMapping(value = "/showBooks", method = RequestMethod.GET)
    public String getBooks(Model m)
    {
        ArrayList<Book> books = bookService.getBooks();
        m.addAttribute("books", books);
        return "showBooks";
    }// getBooks
    
    
    
    
    
    
    
    
    
    
    @RequestMapping(value="/addBook", method = RequestMethod.POST)
    public String addBook(@Valid @ModelAttribute() Book newBook, BindingResult result,
    		HttpServletRequest h, Model m) {
    	
    	
    	return "showBooks";
    }

}// MainController
