package com.sergiojavierre.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class ManejoTipos {

    @RequestMapping("/arraysNumeros")
    public String numeros(Model model){
        Integer[] array = {1,5,3,2,7,9,20,8};
        List<Integer> list = new ArrayList<>(Arrays.stream(array).toList());
        Collections.sort(list);
        model.addAttribute("array", list);
        return "introduccionArray";
    }

    @RequestMapping("/mapas")
    public String mapas(Model model){
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("navegador","chrome");
        mapa.put("IDE","IntelliJ Idea");
        model.addAttribute("mapa",mapa);
        return "mapas";
    }


}
