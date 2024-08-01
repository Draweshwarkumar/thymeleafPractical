package com.practice.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("Inside about handler .......");

        model.addAttribute("name", "Shivam Jha");

        // Get current date and time using LocalDateTime and format it
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);

        model.addAttribute("currentDate", formattedDate);

        return "about";
    }
    
    @GetMapping("/example-loop")
    public String iterateHandler(Model m) {
    	
    	List<String> names = List.of("shivam","ritik","rishav","pankaj");
    	
    	m.addAttribute("names",names);
    	
    	return "Iterate";
    }
}



 
