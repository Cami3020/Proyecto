package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/")
    public String index() {
        return "pagina00"; // Retorna pagina00.html
    }

    @GetMapping("/home")
    public String home() {
        return "pagina01"; // Retorna pagina01.html
    }

    @GetMapping("/transmision")
    public String transmision() {
        return "pagina02"; // Retorna pagina02.html
    }

    @GetMapping("/calendario")
    public String calendario() {
        return "pagina03"; // Retorna pagina03.html
    }

    @GetMapping("/noticias")
    public String noticias() {
        return "pagina04"; // Retorna pagina04.html
    }

    @GetMapping("/foro")
    public String foro() {
        return "pagina05"; // Retorna pagina05.html
    }

    @GetMapping("/circuitos")
    public String circuitos() {
        return "pagina06"; // Retorna pagina06.html
    }

    @GetMapping("/usuarios")
    public String usuarios() {
        return "pagina07"; // Retorna pagina07.html
    }
}

