package com.ioshelp.cursoUdemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ioshelp.cursoUdemy.domain.Categoria;

@Repository
public interface CategoriaRepository2 extends JpaRepository<Categoria, Integer> {

}