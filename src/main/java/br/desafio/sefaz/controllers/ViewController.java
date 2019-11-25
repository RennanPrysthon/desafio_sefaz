package br.desafio.sefaz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    @GetMapping({"/", "/logar"})
    public String login(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return "login";
    }

    @GetMapping({"/cadastrar"})
    public String cadastrar() {
        return "cadastrar";
    }       

    @GetMapping({"/home"})
    public String home() {
        return "home";
    }

    @GetMapping({"/adicionarTelefone"})
    public String addFone(@RequestParam("id") Long id) {
        return "adicionarTelefone";
    }

    @GetMapping({"/verTelefones"})
    public String verFones(@RequestParam("id") Long id) {
        return "verTelefones";
    }

    @GetMapping({"/editarUsuario"})
    public String editarUsuario(@RequestParam("id") Long id) {
        return "editar";
    }

    @GetMapping({"/removerUsuario"})
    public String removerUsuario(@RequestParam("id") Long id) {
        return "removerUsuario";
    }
}

