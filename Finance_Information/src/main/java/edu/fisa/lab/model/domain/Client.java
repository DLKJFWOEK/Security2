package edu.fisa.lab.model.domain;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_no")
	private Long clientNo;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@OneToMany(mappedBy = "Knowledge")
	private List<FinanceInformation> FLList = new ArrayList<>;
}