package com.example.pruebaTecnica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.logging.Level;
import java.util.logging.Logger;

import static org.springframework.boot.Banner.Mode.LOG;

@Controller
public class IndexController {
    private final Logger LOG = Logger.getLogger(""+ IndexController.class);
    @GetMapping("/")
    public String index(Model model){

        System.out.println(IndexController.class + " - index");
        LOG.log(Level.INFO,"index");
        var mensaje ="Luis Angel Herrera";
        model.addAttribute("msj",mensaje);

        return "index";
    }
}
