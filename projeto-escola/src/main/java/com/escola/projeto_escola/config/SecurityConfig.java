package com.escola.projeto_escola.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.escola.projeto_escola.service.UsuarioService;

@Configuration
@EnableMethodSecurity(prePostEnabled = true) // permite @PreAuthorize, @Secured
public class SecurityConfig {

    private final UsuarioService usuarioService;

    public SecurityConfig(UsuarioService us) { this.usuarioService = us; }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()
                .requestMatchers("/public/**").permitAll()
                .requestMatchers("/usuarios/**").permitAll()
                .requestMatchers("/alunos/**").hasAnyRole("ADMIN", "PROFESSOR")
                .requestMatchers("/professores/**").hasAnyRole("ADMIN", "PROFESSOR")
                .anyRequest().authenticated()
            )
            .headers(headers -> headers
                .frameOptions(frame -> frame.disable())
            )
            .httpBasic(withDefaults())
            .formLogin(withDefaults());

        return http.build();
        
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    }
}