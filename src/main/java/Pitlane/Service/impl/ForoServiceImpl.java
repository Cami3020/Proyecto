/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.Service.impl;

import Pitlane.Service.ForoService;
import Pitlane.dao.ForoDao;
import Pitlane.domain.Foro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ForoServiceImpl implements ForoService {

    @Autowired
    private ForoDao foroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Foro> getForos() {
        var lista = foroDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Foro getForo(Foro foro) {
        return foroDao.findById(foro.getIdForo()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Foro foro) {
        foroDao.save(foro);
    }

    @Override
    @Transactional
    public void delete(Foro foro) {
        foroDao.delete(foro);
    }

}
