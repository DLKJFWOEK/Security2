package edu.fisa.lab.finance.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import edu.fisa.lab.finance.model.domain.Knowledge;
import edu.fisa.lab.finance.model.dto.KnowledgeDto;
import edu.fisa.lab.finance.model.repository.KnowledgeRepository;

public class KnowledgeService {
	
	@Autowired
	private KnowledgeRepository knowledgeRepository;
	
	@Transactional
	public List<KnowledgeDto> knowledgeAll(){
		List<Knowledge> kno = knowledgeRepository.findAll();
		List<KnowledgeDto> kList = kno.stream().map(k -> new knowledgeDto().toDto(k)).toList();
		return kList;
	}
}
