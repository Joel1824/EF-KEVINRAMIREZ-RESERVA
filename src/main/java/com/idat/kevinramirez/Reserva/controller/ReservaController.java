package com.idat.kevinramirez.Reserva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.kevinramirez.Reserva.dto.ReservaDTO;
import com.idat.kevinramirez.Reserva.service.ReservaService;



@Controller
@RequestMapping("/api/reserva/v1")
public class ReservaController {

	@Autowired
	private ReservaService service;

	@GetMapping("/listar")
	public @ResponseBody List<ReservaDTO> listar(){
		return service.listar();
	}
	
}
