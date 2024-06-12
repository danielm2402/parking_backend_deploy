package co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DatosR {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private int x;
    private int y;
    private int w;
    private int h;

    @Column(name = "status", columnDefinition = "BOOLEAN")
    private boolean status;
}
