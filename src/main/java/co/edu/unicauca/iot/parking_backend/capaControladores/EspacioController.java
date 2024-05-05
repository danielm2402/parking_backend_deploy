package co.edu.unicauca.iot.parking_backend.capaControladores;

import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.EspacioParking;
import co.edu.unicauca.iot.parking_backend.fachadaServicios.services.EspacioService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/espacios")
public class EspacioController {

    @Autowired
    private EspacioService espacioService;

    @PostMapping("/espacios/upload")
    public EspacioParking guardarEspacio(@RequestBody EspacioParking espacio) {
        return espacioService.guardarEspacio(espacio);
    }

    @GetMapping("/espacios/{id}")
    public ResponseEntity<EspacioParking> obtenerEspacioPorId(@PathVariable Integer id) {
        Optional<EspacioParking> espacioOptional = espacioService.obtenerEspacioPorId(id);
        if (espacioOptional.isPresent()) {
            EspacioParking espacio = espacioOptional.get();
            return new ResponseEntity<>(espacio, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
