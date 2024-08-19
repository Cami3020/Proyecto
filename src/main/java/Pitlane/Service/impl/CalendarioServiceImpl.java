/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.Service.impl;

import Pitlane.Service.CalendarioService;
import Pitlane.dao.CalendarioDao;
import Pitlane.domain.Calendario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CalendarioServiceImpl implements CalendarioService {

    @Autowired
    private CalendarioDao calendarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Calendario> getCalendarios() {
        var lista = calendarioDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Calendario getCalendario(Calendario calendario) {
        return calendarioDao.findById(calendario.getIdCalendario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Calendario calendario) {
        calendarioDao.save(calendario);
    }

    @Override
    @Transactional
    public void delete(Calendario calendario) {
        calendarioDao.delete(calendario);
    }

}
