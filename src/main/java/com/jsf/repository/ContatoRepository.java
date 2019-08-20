package com.jsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsf.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
