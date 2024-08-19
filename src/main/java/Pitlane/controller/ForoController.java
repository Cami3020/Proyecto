/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.controller;

import Pitlane.domain.Foro;
import Pitlane.Service.ForoService;
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
@RequestMapping("/foros")
public class ForoController {
    
    @Autowired
    private ForoService foroService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Foro> foros = foroService.getForos();
        model.addAttribute("foros", foros);
        model.addAttribute("totalForos", foros.size());
        return "/foros/listado";
    }
    
    @PostMapping("/guardar")
    public String foroGuardar(Foro foro) {        
        
        foroService.save(foro);
        return "redirect:/foros/listado";
    }
    
    
}