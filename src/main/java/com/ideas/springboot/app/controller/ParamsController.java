package com.ideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }

    /*Maneja solicitudes GET a /params/string y toma un parámetro de consulta llamado "text" como entrada.
    Si no se proporciona un parámetro de consulta "text", se utiliza el valor predeterminado "No hay valor"*/
    @GetMapping("/string")
    public String param(@RequestParam(name="text", defaultValue = "No hay valor") String text, Model model){
        //Agrega el parámetro de consulta al modelo
        model.addAttribute("result", "El parametro enviado es: " + text);
        //Devuelve el nombre de la vista "params/ver"
        return "params/ver";
    }

    //Maneja solicitudes GET a /params/mix-params y toma dos parámetros de consulta, "greeting" y "number", como entrada.
    @GetMapping("/mix-params")
    public String param(@RequestParam("greeting") String greeting,
                        //Si no se proporciona un parámetro de consulta "number", se utiliza el valor predeterminado 0.
                        @RequestParam(value = "number", defaultValue = "0") Integer number,
                        Model model){
        //Agrega un mensaje que combina los dos parámetros de consulta al modelo
        model.addAttribute("result", "El saludo enviado es: " + greeting + "' y el número es '" + number + "'");
        //se devuelve el nombre de la vista "params/ver"
        return "params/ver";
    }

    //Maneja solicitudes GET a /params/mix-params-request y utiliza un objeto HttpServletRequest para obtener los parámetros de consulta "greeting" y "number".
    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model){
        String greeting = request.getParameter("greeting");
        Integer number = null;
        //Si no se proporciona un parámetro de consulta "number", se establece en 0.
        try{
            number = Integer.parseInt(request.getParameter("number"));
        }catch(NumberFormatException e) {
            number = 0;
        }
        //se agrega un mensaje que combina los dos parámetros de consulta al modelo
        model.addAttribute("result", "El saludo enviado es: " + greeting + "' y el número es '" + number + "'");
        //devuelve el nombre de la vista "params/ver"
        return "params/ver";
    }
}
