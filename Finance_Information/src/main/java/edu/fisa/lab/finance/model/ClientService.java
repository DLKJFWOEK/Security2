//package edu.fisa.lab.finance.model;
//
//import java.util.Optional;
//
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import edu.fisa.lab.finance.model.domain.Client;
//import edu.fisa.lab.finance.model.domain.Knowledge;
//import edu.fisa.lab.finance.model.dto.ClientDto;
//
//public class ClientService {

//	@Autowired
//	private ClientRepository ClientRepository;
	
//	@Autowired
//	private KnowledgeRepository knowledgeRepository;
	
//	@Autowired
//	private FinanceHackRepository FinanceHackRepository;
	
//	private ModelMapper mp = new ModelMapper();
	
//	@Transactional
//	public Long insertClient(ClientDto clientDto) {
//		
//		Client c = clientDto.toEntity(clientDto);
//		clientRepository.save(c);
//		return c.getClientNo();
//	}
//	@Transactional
//	public void insertClient(Long clientNo, Long knowledgeNo) throws Exception{
//		Optional<Client> c = clientRepository.findByNo(clientNo);
//		Optional<Knowledge> k = knowledgeRepository.findByNo(knowledgeNo);
//		clientRepository.save(c.get());
//		knowledgeRepository.save(c.get());
//	}
//	@Transactional
//	public void insertClient2(Long clientNo, Long financeHackNo) throws Exception{
//		Optional<Client> c = clientRepository.findByNo(clientNo);
//		Optional<financeHack> fh = financeHackRepository.findByNo(financeHackNo);
//		clientRepository.save(c.get());
//		financeHackRepository.save(fh.get());
//	}
	
