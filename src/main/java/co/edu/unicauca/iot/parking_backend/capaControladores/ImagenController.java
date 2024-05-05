package co.edu.unicauca.iot.parking_backend.capaControladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.Imagen;
import co.edu.unicauca.iot.parking_backend.fachadaServicios.services.ImagenService;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/imagen")
public class ImagenController {

    @Autowired
    private ImagenService imagenService;

    @PostMapping("/imagen/upload")
    public ResponseEntity<String> uploadImagen(@RequestPart("imagen") MultipartFile imagen) {
        try {
            Imagen imagenGuardada = imagenService.guardarImagen(imagen);
            
            System.out.println(imagenGuardada.getIdimagen()); 
            return new ResponseEntity<>("Imagen recibida y guardada en memoria", HttpStatus.OK);

        } catch (IOException e) {
            return new ResponseEntity<>("Error al procesar la imagen: " + e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
