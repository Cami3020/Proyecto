/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pitlane.Service;

import Pitlane.domain.Home;
import java.util.List;

public interface HomeService {

    // Se obtiene un listado de categorias en un List
    public List<Home> getHomes();

    // Se obtiene un Categoria, a partir del id de un categoria
    public Home getHome(Home noticia);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Home noticia);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Home noticia);
}
