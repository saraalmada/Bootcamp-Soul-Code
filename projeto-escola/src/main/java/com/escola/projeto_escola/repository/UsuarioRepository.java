package com.escola.projeto_escola.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.projeto_escola.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
