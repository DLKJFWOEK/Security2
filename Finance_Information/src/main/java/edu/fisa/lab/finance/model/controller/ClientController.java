package edu.fisa.lab.finance.model.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fisa.lab.finance.model.dto.ClientDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(path = "/client", method = RequestMethod.POST)
	public String insertClient(ClientDto clientDto, HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		Long clientId = clientService.insertClient(clientDto);
		String client = request.getParameter("name");
		
		HttpSession session = request.getSession();
		session.setAttribute("clientId", clientId);
		session.setAttribute("name", name);
		return "redirect:/main.jsp";
	}
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈" + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}	
}
