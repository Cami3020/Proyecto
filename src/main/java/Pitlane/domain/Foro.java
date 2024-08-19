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
@Table(name = "foro")
public class Foro implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foro")
    private Long idForo;
    private String mensajeForo;
    private String temaForo;
    private String fechaPublicacion;
    

    public Foro() {
    }

    
    public Foro(String mensajeForo, String fechaPublicacion, String temaForo) {
        this.mensajeForo = mensajeForo;
        this.fechaPublicacion = fechaPublicacion;
        this.temaForo = temaForo;
    }

}
