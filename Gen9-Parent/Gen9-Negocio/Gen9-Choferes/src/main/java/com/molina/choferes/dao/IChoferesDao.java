package com.molina.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.molina.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long> {
    


}
