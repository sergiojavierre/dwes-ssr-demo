package com.sergiojavierre.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Introduccion {

    @GetMapping("/introduccion/{nombre}")
    public String muestraNombre(@PathVariable String nombre, Model model){
        model.addAttribute("nombre", nombre);
        return "introduccionNombre";
    }

    @GetMapping("/introduccion/{nombre}/{edad}")
    public String muestraNombre(@PathVariable String nombre, @PathVariable Integer edad, Model model){
        model.addAttribute("nombre", nombre);
        model.addAttribute("edad", edad);
        return "introduccionNombreEdad";
    }

    @GetMapping("/introduccion/suma/{x}/{y}")
    public String muestraNombre(@PathVariable Integer x, @PathVariable Integer y, Model model){
        Integer resultado = x + y;
        model.addAttribute("resultado", resultado);
        return "introduccionSuma";
    }

    @RequestMapping("/introduccion/array")
    public String array(Model model){
        String[] array = {"a","b","c"};
        model.addAttribute("array",array);
        return "introduccionArray";
    }

}
