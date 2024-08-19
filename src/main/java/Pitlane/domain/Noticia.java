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
@Table(name = "noticia")
public class Noticia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia")
    private Long idNoticia;
    private String tituloNoticia;
    private String textoNoticia;
    private String imagenNoticia;

    public Noticia() {
    }
    
    public Noticia(String tituloNoticia, String textoNoticia, String imagenNoticia) {
        this.tituloNoticia = tituloNoticia;
        this.textoNoticia = textoNoticia;
        this.imagenNoticia = imagenNoticia;
    }

}
