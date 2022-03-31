package com.amorim.devstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amorim.devstore.domain.Categoria;

@Repository

public interface PartsRepository extends JpaRepository<Categoria, Integer> {

}
