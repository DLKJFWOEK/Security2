package edu.fisa.lab.finance.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="knowledge")
public class Knowledge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "k_no")
	private Long knowledgeNo;
	
	@Column
	private String name;
	
	@Column
	private String content;
	
	@Column
	private Category category;

}