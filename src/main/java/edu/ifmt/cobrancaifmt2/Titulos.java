package edu.ifmt.cobrancaifmt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifmt.cobrancaifmt2.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	
	

}
