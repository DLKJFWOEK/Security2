package edu.fisa.lab.finance.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.fisa.lab.model.dto.KnowledgeDto;

@Controller
public class KnowledgeController {

	@Autowired
	private KnowledgeService knowledgeService;
	
	@RequestMapping(path = "/knowledgeAll", method = RequestMethod.GET)
	public ModelAndView knowledgeAll() {
		List<KnowledgeDto> all = knowledgeService.knowledgeAll();
		ModelAndView mv = new ModelAndView();
		mv.addObject("knowledgeAll", all);
		mv.setViewName("allpage");
		System.out.println("=== " + all);
		return mv;
	}
//	@RequestMapping(path = "/knowledgeSave", method = RequestMethod.POST)
//	public String knowledgeInsert(KnowledgeDto knowledgeDto) {
//		knowledgeService.knowledgeInsert(knowledgeDto);
//		return "redirect:/main.jsp";	
//			
//	}
}
