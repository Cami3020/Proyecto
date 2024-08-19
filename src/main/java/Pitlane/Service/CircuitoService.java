/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pitlane.Service;

import Pitlane.domain.Circuito;
import java.util.List;

public interface CircuitoService {

    // Se obtiene un listado de categorias en un List
    public List<Circuito> getCircuitos();

    // Se obtiene un Categoria, a partir del id de un categoria
    public Circuito getCircuito(Circuito circuito);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Circuito circuito);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Circuito circuito);
}
