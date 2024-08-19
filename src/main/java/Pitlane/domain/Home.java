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
@Table(name = "home")
public class Home implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_home")
    private Long idHome;
    private String tituloHome;
    private String textoHome;
    private String imagenHome;

    public Home() {
    }
    
    public Home(String tituloHome, String textoHome, String imagenHome) {
        this.tituloHome = tituloHome;
        this.textoHome = textoHome;
        this.imagenHome = imagenHome;
    }

}
