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
@Table(name = "calendario")
public class Calendario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calendario")
    private Long idCalendario;
    private String tituloCalendario;
    private String textoCalendario;
    private String pilotoPrimerLugar;
    private String equipoPrimerLugar;
    private String pilotoSegundoLugar;
    private String equipoSegundoLugar;
    private String pilotoTercerLugar;
    private String equipoTercerLugar;

    public Calendario() {
    }
    
    public Calendario(String tituloCalendario, String textoCalendario, 
            String pilotoPrimerLugar, String equipoPrimerLugar, 
            String pilotoSegundoLugar, String equipoSegundoLugar, 
            String pilotoTercerLugar, String equipoTercerLugar) {
        this.tituloCalendario = tituloCalendario;
        this.textoCalendario = textoCalendario;
        this.pilotoPrimerLugar = pilotoPrimerLugar;
        this.equipoPrimerLugar = equipoPrimerLugar;
        this.pilotoSegundoLugar = pilotoSegundoLugar;
        this.equipoSegundoLugar = equipoSegundoLugar;
        this.pilotoTercerLugar = pilotoTercerLugar;
        this.equipoTercerLugar = equipoTercerLugar;
    }

}
