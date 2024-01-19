package edu.fisa.lab.finance.model.dto;

import edu.fisa.lab.finance.model.domain.Category;
import edu.fisa.lab.finance.model.domain.Knowledge;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class KnowledgeDto {
	
	private String name;
	private String content;
	private Category category;
	
	public Knowledge toEntity(KnowledgeDto knowledgeDto) {
		return Knowledge.builder()
				.name(knowledgeDto.getName())
				.content(knowledgeDto.getContent())
				.category(knowledgeDto.getCategory())
				.build();
	}
}
