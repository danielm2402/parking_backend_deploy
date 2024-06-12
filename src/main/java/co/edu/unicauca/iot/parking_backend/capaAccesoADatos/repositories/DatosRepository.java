package co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.DatosR;

public interface DatosRepository extends CrudRepository<DatosR, Integer> {

}
