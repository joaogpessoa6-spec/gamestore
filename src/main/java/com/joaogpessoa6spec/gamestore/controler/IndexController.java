package com.joaogpessoa6spec.gamestore.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Rotas de navegação do site
    @GetMapping("/") // GetMapping lê a barra de pesquisa após o url do domínio do site
    public String getIndex() {
        return "index";
    }
    @GetMapping("/home")
    public String getHome() {
        return "index";
    }
    @GetMapping("/game-add")
    public String getGameAdd() {
        return "/game/add";
    }
}
