package edu.ifmt.cobrancaifmt2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import edu.ifmt.cobrancaifmt2.Titulos;
import edu.ifmt.cobrancaifmt2.model.StatusTitulo;
import edu.ifmt.cobrancaifmt2.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	@Autowired
	private Titulos titulos;
	
	@RequestMapping("/novo")
	//public String novo() {
		//return "CadastroTitulo";
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("todosStatusTitulo", StatusTitulo.values());
		return mv;
	}
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
	//public String salvar(Titulo titulo) {
		titulos.save(titulo);
		//return "CadastroTitulo";
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Foi salvo com sucesso!");
		return mv;
		
		
	}
	
	@RequestMapping
	public ModelAndView pesquisar() {
		List<Titulo> todosTitulos = titulos.findAll();
		//return "PesquisaTitulos";
		ModelAndView mv = new ModelAndView("PesquisaTitulos");
		mv.addObject("titulos", todosTitulos);
		return mv;
	}
}
