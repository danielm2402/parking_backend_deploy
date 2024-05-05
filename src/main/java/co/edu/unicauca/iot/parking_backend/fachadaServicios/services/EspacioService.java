package co.edu.unicauca.iot.parking_backend.fachadaServicios.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.EspacioParking;
import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories.EspacioParkingRepository;
import jakarta.transaction.Transactional;

@Service
public class EspacioService {

    @Autowired
    private EspacioParkingRepository espacioRepository;

    @Transactional
    public List<EspacioParking> guardarEspacios(List<EspacioParking> espacios) {
        List<EspacioParking> espaciosGuardados = new ArrayList<>();
        for (EspacioParking espacio : espacios) {
            EspacioParking espacioGuardado = espacioRepository.save(espacio);
            espaciosGuardados.add(espacioGuardado);
        }
        return espaciosGuardados;
    }

    public Optional<EspacioParking> obtenerEspacioPorId(Integer id) {
        return espacioRepository.findById(id);
    }

}
