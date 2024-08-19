/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pitlane.dao;

import Pitlane.domain.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CalendarioDao extends JpaRepository<Calendario, Long> {
    
}
