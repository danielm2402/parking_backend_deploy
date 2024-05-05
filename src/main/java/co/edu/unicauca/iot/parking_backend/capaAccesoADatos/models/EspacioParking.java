package co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EspacioParking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspacio;  

    @Column(name = "status")
    private boolean status; //= ocupado  true = SI  o false = NO // para cada espacio en la imagen.

}
