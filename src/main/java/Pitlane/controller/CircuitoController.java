/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.controller;

import Pitlane.Service.FirebaseStorageService;
import Pitlane.domain.Circuito;
import Pitlane.Service.CircuitoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/circuitos")
public class CircuitoController {
    
    @Autowired
    private CircuitoService circuitoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Circuito> circuitos = circuitoService.getCircuitos();
        model.addAttribute("circuitos", circuitos);
        model.addAttribute("totalCircuitos", circuitos.size());
        return "/circuitos/listado";
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String circuitoGuardar(Circuito circuito) {        
        
        circuitoService.save(circuito);
        return "redirect:/circuitos/listado";
    }
    
    
}