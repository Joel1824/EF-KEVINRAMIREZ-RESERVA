package com.idat.kevinramirez.Reserva.service;

import java.util.List;

import com.idat.kevinramirez.Reserva.dto.ReservaDTO;



public interface ReservaService {
	
	List<ReservaDTO> listar();

	ReservaDTO obtenerId(Integer id);

	void guardar(ReservaDTO reserva);

	void eliminar(Integer id);

	void actualizar(ReservaDTO reserva);

}
