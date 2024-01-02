package edu.fisa.lab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fisa.lab.customer.dto.CustomerDto;
import edu.fisa.lab.service.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(path = "/customer", method = RequestMethod.POST)
	public String insertCustomer(CustomerDto customerDto, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		customerService.insertCustomer(customerDto);
		PrintWriter out = response.getWriter();
		
		String mId = request.getParameter("id");
		
		out.print("id : " + mId);
		
		HttpSession session = request.getSession();
		session.setAttribute("id", mId);
		return "redirect:/main.jsp";//redirect 방식으로 jsp로 이동
	}
}