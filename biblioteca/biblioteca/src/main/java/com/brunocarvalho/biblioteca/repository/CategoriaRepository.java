package com.brunocarvalho.biblioteca.repository;

import com.brunocarvalho.biblioteca.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}