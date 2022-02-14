package com.example.ProyectoPrueba.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.ProyectoPrueba.Entity.Consulta;


@Repository
public interface ConsultaRepository extends CrudRepository <Consulta, Integer>{
	@Query(value = "select v.placa, e.empresa, e.Numero_Documento, COUNT(1) as cant from dbo.personas_vehiculos_empresas pve inner join dbo.vehiculos v on pve.id_vehiculo = v.id_vehiculo inner join dbo.Personas p on pve.id_persona = p.id_persona inner join dbo.empresas e on pve.id_empresa = e.id_empresa  where pve.estado = 'AFILIADO' group by v.placa, e.empresa, e. Numero_Documento HAVING COUNT(1) > 2 ORDER BY v.placa ASC;", nativeQuery = true)
	public ArrayList <Consulta> ObtenerResultado();
}
