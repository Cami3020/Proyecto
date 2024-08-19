/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.controller;

import Pitlane.domain.Transmision;
import Pitlane.Service.TransmisionService;
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
@RequestMapping("/transmision")
public class TransmisionController {
    
    @Autowired
    private TransmisionService transmisionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Transmision> transmisiones = transmisionService.getTransmisiones();
        model.addAttribute("transmisiones", transmisiones);
        model.addAttribute("totalTransmisiones", transmisiones.size());
        return "/transmision/listado";
    }
    
    @PostMapping("/guardar")
    public String transmisionGuardar(Transmision transmision) {        
        
        transmisionService.save(transmision);
        return "redirect:/transmision/listado";
    }
    
    
}