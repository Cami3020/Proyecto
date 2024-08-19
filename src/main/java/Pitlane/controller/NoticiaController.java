/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pitlane.controller;

import Pitlane.Service.FirebaseStorageService;
import Pitlane.domain.Noticia;
import Pitlane.Service.NoticiaService;
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
@RequestMapping("/noticias")
public class NoticiaController {
    
    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Noticia> noticias = noticiaService.getNoticias();
        model.addAttribute("noticias", noticias);
        model.addAttribute("totalNoticias", noticias.size());
        return "/noticias/listado";
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String noticiaGuardar(Noticia noticia) {        
        
        noticiaService.save(noticia);
        return "redirect:/noticias/listado";
    }
    
    
}