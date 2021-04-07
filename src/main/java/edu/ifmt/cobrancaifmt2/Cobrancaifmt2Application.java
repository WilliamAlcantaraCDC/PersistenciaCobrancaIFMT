package edu.ifmt.cobrancaifmt2;

import java.util.Locale;

import org.apache.tomcat.util.descriptor.LocalResolver;
//semana da aula 18, slide pediu pra retirar, ver aquivos pedroSe18 import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class Cobrancaifmt2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cobrancaifmt2Application.class, args);
	}
 @Bean
 public FixedLocaleResolver localResolver() {
	return new FixedLocaleResolver(new Locale("pt", "BR"));
	 
	 
 }/*
 public ServletRegistrationBean h2servletRegistration() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    return registration;
	}*/
}
