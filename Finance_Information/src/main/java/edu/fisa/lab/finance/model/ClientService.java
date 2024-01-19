package edu.fisa.lab.finance.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu.fisa.lab.finance.model.dto.ClientDto;
import edu.fisa.lab.finance.model.entity.Client;
import edu.fisa.lab.finance.model.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
		
	@Transactional
	public Long insertClient(ClientDto clientDto) {
		
		Client c = clientDto.toEntity(clientDto);
		clientRepository.save(c);
		return c.getClientNo();
	}
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈 " + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}
}
	
