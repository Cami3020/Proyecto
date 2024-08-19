/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.Service.impl;



import Pitlane.Service.NoticiaService;
import Pitlane.dao.NoticiaDao;
import Pitlane.domain.Noticia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoticiaServiceImpl implements NoticiaService {

    @Autowired
    private NoticiaDao noticiaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Noticia> getNoticias() {
        var lista = noticiaDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Noticia getNoticia(Noticia noticia) {
        return noticiaDao.findById(noticia.getIdNoticia()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Noticia noticia) {
        noticiaDao.save(noticia);
    }

    @Override
    @Transactional
    public void delete(Noticia noticia) {
        noticiaDao.delete(noticia);
    }

}
