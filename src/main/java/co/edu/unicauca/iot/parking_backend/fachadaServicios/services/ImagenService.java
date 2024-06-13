package co.edu.unicauca.iot.parking_backend.fachadaServicios.services;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models.Imagen;
import co.edu.unicauca.iot.parking_backend.capaAccesoADatos.repositories.ImagenRepository;

@Service
public class ImagenService {

    @Autowired
    private ImagenRepository imagenRepository;

    public Imagen guardarImagenlocal(MultipartFile file) throws IOException {
        byte[] imagenBytes = file.getBytes();
        Imagen imagen = new Imagen();
        imagen.setImagen(imagenBytes);
        return imagenRepository.save(imagen);
    }

    public Imagen guardarImagen(MultipartFile archivo) throws IOException {
        Imagen imagen = new Imagen();
        imagen.setImagen(archivo.getBytes());
        return imagenRepository.save(imagen);
    }

    public Optional<Imagen> obtenerImagen(Integer id) {
        return imagenRepository.findById(id);
    }

}
