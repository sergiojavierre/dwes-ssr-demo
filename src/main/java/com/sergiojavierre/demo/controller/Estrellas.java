package com.sergiojavierre.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Estrellas {

    @RequestMapping("/estrellas")
    public String estrellas(Model model){
        String texto = "";
        List<String> lineasEstrellas = new ArrayList<>();
        int lineas = 10, numEstrellas = 1;
        for (int i = 0; i < lineas; i++, numEstrellas++) {
            for (int j = 0; j < numEstrellas; j++) {
                texto += "*";
            }
            lineasEstrellas.add(texto);
            texto = "";
        }
        model.addAttribute("estrellas",lineasEstrellas);
        return "estrellas";
    }
}
