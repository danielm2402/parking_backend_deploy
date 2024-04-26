package co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories;

import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.EspacioParking;

public interface EspacioParkingRepository extends CrudRepository<EspacioParking,Integer>{

}
