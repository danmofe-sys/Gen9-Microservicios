package com.molina.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.molina.camiones.models.Camion;

public interface ICamionesDao extends JpaRepository<Camion, Long>{


}
