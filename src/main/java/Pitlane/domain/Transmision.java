/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Automaticamente crear los set y get
@Entity
@Table(name = "transmision")
public class Transmision implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transmision")
    private Long idTransmision;
    private String urlTransmision;
    

    public Transmision() {
    }

    
    public Transmision(String urlTransmision) {
        this.urlTransmision = urlTransmision;
    }

}

