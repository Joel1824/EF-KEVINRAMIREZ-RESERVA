package com.idat.kevinramirez.Reserva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.kevinramirez.Reserva.dto.ReservaDTO;
import com.idat.kevinramirez.Reserva.model.Reserva;
import com.idat.kevinramirez.Reserva.repository.ReservaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {
	
	@Autowired
	private ReservaRepository repository;


	@Override
	public List<ReservaDTO> listar() {
		List<ReservaDTO> listadto = new ArrayList<>();
		ReservaDTO dto = null;
				
		for (Reserva turista : repository.findAll()) {
			dto = new ReservaDTO();
			dto.setCost(turista.getCosto());
			
			listadto.add(dto);
		}
		
		return listadto;
	}

	@Override
	public ReservaDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(ReservaDTO reserva) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(ReservaDTO reserva) {
		// TODO Auto-generated method stub

	}

}
