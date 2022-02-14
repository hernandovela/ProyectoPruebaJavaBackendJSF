package com.example.ProyectoPrueba.Service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProyectoPrueba.Entity.Consulta;
import com.example.ProyectoPrueba.Repository.ConsultaRepository;

@Service
public class ConsultaService {
	@Autowired
	ConsultaRepository consultaRepository;
	public ArrayList <Consulta> ObtenerResultado(){
		ArrayList <Consulta> Lista = consultaRepository.ObtenerResultado();
		return Lista;
	}
}
