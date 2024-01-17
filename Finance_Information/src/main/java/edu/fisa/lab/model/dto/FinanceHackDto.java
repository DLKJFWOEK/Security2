package edu.fisa.lab.model.dto;

import edu.fisa.lab.model.domain.Category;
import edu.fisa.lab.model.domain.FinanceHack;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class FinanceHackDto {
	
	private String name;
	private String content;
	private Category category;
	
	public FinanceHack toEntity(FinanceHackDto financeHackDto) {
		return FinanceHack.builder()
				.name(financeHackDto.getName())
				.content(financeHackDto.getContent())
				.category(financeHackDto.getCategory())
				.build();
	}
}
