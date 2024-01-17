package edu.fisa.lab.finance.model;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu.fisa.lab.finance.model.domain.Client;
import edu.fisa.lab.finance.model.domain.Knowledge;
import edu.fisa.lab.finance.model.dto.ClientDto;
import edu.fisa.lab.finance.model.repository.ClientRepository;
import edu.fisa.lab.finance.model.repository.KnowledgeRepository;

public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private KnowledgeRepository knowledgeRepository;
		
	private ModelMapper mp = new ModelMapper();
	
	@Transactional
	public Long insertClient(ClientDto clientDto) {
		
		Client c = clientDto.toEntity(clientDto);
		clientRepository.save(c);
		return c.getClientNo();
	}
	@Transactional
	public void insertClient(Long clientNo, Long knowledgeNo) throws Exception{
		Optional<Client> c = clientRepository.findByNo(clientNo);
		Optional<Knowledge> k = knowledgeRepository.findByNo(knowledgeNo);
		clientRepository.save(c.get());
	}
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model m) {
		m.addAttribute("errorMsg", "발생된 이슈 " + e.getMessage());
		e.printStackTrace();
		return "forward:showError.jsp";
	}
}
	
