package br.desafio.sefaz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    @GetMapping({"/logar"})
    public String login() {
        return "login";
    }

    @GetMapping({"/cadastrar"})
    public String cadastrar() {
        return "cadastrar";
    }       

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping({"/adicionarTelefone"})
    public String addFone() {
        return "adicionarTelefone";
    }

    @GetMapping({"/verTelefones"})
    public String verFones() {
        return "verTelefones";
    }

    @GetMapping({"/editarUsuario"})
    public String editarUsuario() {
        return "editar";
    }

    @GetMapping({"/removerUsuario"})
    public String removerUsuario() {
        return "removerUsuario";
    }
}

