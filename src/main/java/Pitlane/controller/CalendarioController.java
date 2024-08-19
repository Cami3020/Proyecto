/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.controller;

import Pitlane.Service.FirebaseStorageService;
import Pitlane.domain.Calendario;
import Pitlane.Service.CalendarioService;
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
@RequestMapping("/calendario")
public class CalendarioController {
    
    @Autowired
    private CalendarioService calendarioService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Calendario> calendarios = calendarioService.getCalendarios();
        model.addAttribute("calendarios", calendarios);
        model.addAttribute("totalCalendarios", calendarios.size());
        return "/calendario/listado";
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String calendarioGuardar(Calendario calendario) {        
        
        calendarioService.save(calendario);
        return "redirect:/calendario/listado";
    }
    
    
}