package com.amorim.devstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amorim.devstore.domain.Categoria;

@Repository

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
