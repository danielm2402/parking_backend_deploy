package co.edu.unicauca.iot.parking_backend.fachadaServicios.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.EspacioParking;
import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories.EspacioParkingRepository;

@Service
public class EspacioParkingService {

    @Autowired
    private EspacioParkingRepository espacioRepository;

    public Integer guardarImagen(MultipartFile file) throws IOException {
        EspacioParking imagen = new EspacioParking();
        imagen.setData(file.getBytes());
        EspacioParking savedImagen = espacioRepository.save(imagen);
        return savedImagen.getIdparking();
    }

    public byte[] obtenerImagen(Integer id) {
        EspacioParking imagen = espacioRepository.findById(id).orElse(null);
        if (imagen != null) {
            return imagen.getData();
        } else {
            return null; // Manejo de error si la imagen no se encuentra
        }
    }

}
