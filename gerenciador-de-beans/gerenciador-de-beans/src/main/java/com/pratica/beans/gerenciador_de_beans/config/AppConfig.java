package com.pratica.beans.gerenciador_de_beans.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public List<String> tarefasIniciais(){
		return List.of("Configurar banco de dados", "Carregar dados iniciais");
	}

}
