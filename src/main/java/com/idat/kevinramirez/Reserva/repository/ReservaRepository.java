package com.idat.kevinramirez.Reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.kevinramirez.Reserva.model.Reserva;



@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
