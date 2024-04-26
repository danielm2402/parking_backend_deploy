package co.edu.unicauca.iot.parking_backend.capaControladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.edu.unicauca.iot.parking_backend.fachadaServicios.services.EspacioParkingService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/espacios")
public class EspacioParkingController {

    @Autowired
    private EspacioParkingService espacioService;
    
    @PostMapping("/upload")
    public Integer cargarImagen(@RequestParam("file") MultipartFile file ) throws IOException{
        return espacioService.guardarImagen(file);
    }
    
    @GetMapping("/{id}")
    public byte[] getImagen(@PathVariable Integer id) {
        return espacioService.obtenerImagen(id);
    }
    
}
