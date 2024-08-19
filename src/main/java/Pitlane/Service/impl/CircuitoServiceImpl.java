/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.Service.impl;


import Pitlane.Service.CircuitoService;
import Pitlane.dao.CircuitoDao;
import Pitlane.domain.Circuito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CircuitoServiceImpl implements CircuitoService {

    @Autowired
    private CircuitoDao circuitoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Circuito> getCircuitos() {
        var lista = circuitoDao.findAll();
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Circuito getCircuito(Circuito circuito) {
        return circuitoDao.findById(circuito.getIdCircuito()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Circuito circuito) {
        circuitoDao.save(circuito);
    }

    @Override
    @Transactional
    public void delete(Circuito circuito) {
        circuitoDao.delete(circuito);
    }

}
