package edu.fisa.lab.finance.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fisa.lab.finance.model.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
