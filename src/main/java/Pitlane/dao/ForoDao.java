/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pitlane.dao;

import Pitlane.domain.Foro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ForoDao extends JpaRepository<Foro, Long> {
    
}
