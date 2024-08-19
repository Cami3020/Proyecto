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
@Table(name = "circuito")
public class Circuito implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_circuito")
    private Long idCircuito;
    private String tituloCircuito;
    private String textoCircuito;
    private String imagenCircuito;

    public Circuito() {
    }
    
    public Circuito(String tituloCircuito, String textoCircuito, String imagenCircuito) {
        this.tituloCircuito = tituloCircuito;
        this.textoCircuito = textoCircuito;
        this.imagenCircuito = imagenCircuito;
    }

}
