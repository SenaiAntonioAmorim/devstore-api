package com.amorim.devstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amorim.devstore.domain.Parts;

@Repository

public interface PartsRepository extends JpaRepository<Parts, Integer> {

}
