/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pitlane.Service;

import Pitlane.domain.Noticia;
import java.util.List;

public interface NoticiaService {

    // Se obtiene un listado de categorias en un List
    public List<Noticia> getNoticias();

    // Se obtiene un Categoria, a partir del id de un categoria
    public Noticia getNoticia(Noticia noticia);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Noticia noticia);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Noticia noticia);
}
