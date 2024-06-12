package co.edu.unicauca.iot.parking_backend.capaControladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.DatosR;
import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories.DatosRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class DatosRController {
    
@Autowired
    private DatosRepository datosRepository;

    @PostMapping("/datos")
    public List<DatosR> cargarDatos(@RequestBody List<DatosR> rectangles) {
        return (List<DatosR>) datosRepository.saveAll(rectangles);
    }

    @GetMapping("/datos")
    public List<DatosR> getDatos() {
        return (List<DatosR>) datosRepository.findAll();
    }   
}
