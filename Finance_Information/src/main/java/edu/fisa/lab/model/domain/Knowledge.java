package edu.fisa.lab.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
public class Knowledge {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "k_no")
	private Long knowledgeNo;
	
	@Column
	private String name;
	
	@Column
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_no")
	private Client client;
}