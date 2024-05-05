package co.edu.unicauca.iot.parking_backend.fachadaServicios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.EspacioParking;
import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories.EspacioParkingRepository;

@Service
public class EspacioService {

    @Autowired
    private EspacioParkingRepository espacioRepository;

    public EspacioParking guardarEspacio(EspacioParking espacio) {
        return espacioRepository.save(espacio);
    }

    public Optional<EspacioParking> obtenerEspacioPorId(Integer id) {
        return espacioRepository.findById(id);
    }

}
