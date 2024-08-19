/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.Service.impl;

import Pitlane.Service.HomeService;
import Pitlane.dao.HomeDao;
import Pitlane.domain.Home;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeDao homeDao;

    @Override
    @Transactional(readOnly = true)
    public List<Home> getHomes() {
        var lista = homeDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Home getHome(Home noticia) {
        return homeDao.findById(noticia.getIdHome()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Home noticia) {
        homeDao.save(noticia);
    }

    @Override
    @Transactional
    public void delete(Home noticia) {
        homeDao.delete(noticia);
    }

}
