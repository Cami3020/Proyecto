/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package Pitlane.controller;

import Pitlane.Service.FirebaseStorageService;
import Pitlane.domain.Home;
import Pitlane.Service.HomeService;
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
@RequestMapping("/home")
public class HomeController {
    
    @Autowired
    private HomeService homeService;
    
    @GetMapping("")
    public String inicio2(Model model) {
        List<Home> homes = homeService.getHomes();
        model.addAttribute("homes", homes);
        model.addAttribute("totalHomes", homes.size());
        return "/home/listado";
    }

    @GetMapping("/home")
    public String inicio(Model model) {
        List<Home> homes = homeService.getHomes();
        model.addAttribute("homes", homes);
        model.addAttribute("totalHomes", homes.size());
        return "/home/listado";
    }
    
    @Autowired
    private FirebaseStorageService firebaseStorageService;
    
    @PostMapping("/guardar")
    public String homeGuardar(Home home) {        
        
        homeService.save(home);
        return "redirect:/home/listado";
    }
    
    
}