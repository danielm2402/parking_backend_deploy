package co.edu.unicauca.iot.parking_backend.capaAccesoADatos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EspacioParking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idparking;

    @Lob
    @Column(name = "data", columnDefinition = "LONGBLOB")
    private byte[] data;//imagen

    private boolean status; //= ocupado  true = SI  o false = NO


}
