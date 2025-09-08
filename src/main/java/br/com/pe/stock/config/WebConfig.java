package br.com.pe.stock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.pe.stock.controller.ProdutosController;


@Configuration
@ComponentScan(basePackageClasses = { ProdutosController.class })
@EnableWebMvc

public class WebConfig extends WebMvcConfigurerAdapter {
	
	

}
