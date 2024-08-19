/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package Pitlane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jerem
 */
@Controller
public class IndexController {
    
    @RequestMapping("")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/home/listado";
    }
    
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("attribute", "value");
        return "/home/listado";
    }
    
    @RequestMapping("/calendario")
    public String calendario(Model model) {
        model.addAttribute("attribute", "value");
        return "/calendario/listado";
    }
    
    @RequestMapping("/circuitos")
    public String circuitos(Model model) {
        model.addAttribute("attribute", "value");
        return "/circuitos/listado";
    }
    
    @RequestMapping("/foros")
    public String foros(Model model) {
        model.addAttribute("attribute", "value");
        return "/foros/listado";
    }
    
    @RequestMapping("/noticias")
    public String noticias(Model model) {
        model.addAttribute("attribute", "value");
        return "/noticias/listado";
    }
    
    @RequestMapping("/transmision")
    public String transmision(Model model) {
        model.addAttribute("attribute", "value");
        return "/transmision/listado";
    }
    
}
