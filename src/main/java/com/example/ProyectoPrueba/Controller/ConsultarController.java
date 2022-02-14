package com.example.ProyectoPrueba.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ProyectoPrueba.Entity.Consulta;
import com.example.ProyectoPrueba.Service.ConsultaService;

@RestController
public class ConsultarController {
	@Autowired
	ConsultaService consultaservice;
	@GetMapping("/Index")
	public ArrayList <Consulta> ObtenerResultado() {
		return consultaservice.ObtenerResultado();
	}
}
