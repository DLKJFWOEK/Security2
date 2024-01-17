package edu.fisa.lab.model.dto;

import edu.fisa.lab.model.domain.Category;
import edu.fisa.lab.model.domain.Knowledge;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
