package com.ideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//controlador de Spring MVC que maneja solicitudes HTTP para la ruta '/variables'
@Controller
@RequestMapping("/variables")
public class PathVariablesController {

    /*El método, 'index', maneja solicitudes GET a la ruta '/variables/' y agrega un atributo 'title' al modelo. Luego, devuelve la vista 'variables/index'.*/
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Enviar parámetros de la ruta (@PathVariable)");
        return "variables/index";
    }

    /*El método, 'variables', maneja solicitudes GET a la ruta '/variables/string/{text}' y agrega dos atributos al modelo: 'title' y 'result'.
    'text' es un parámetro de ruta y se recibe a través del parámetro de anotación @PathVariable. 'result' es un mensaje que incluye el valor de 'text'.
    Luego, devuelve la vista 'variables/ver'*/
    @GetMapping("/string/{text}")
    public String variables(@PathVariable String text, Model model){
        model.addAttribute("title", "Recibir parámetros del Request (@PathVariable)");
        model.addAttribute("result", "El texto enviado en la ruta es: " + text);
        return "variables/ver";
    }

    /*El metodo 'variables', maneja solicitudes GET a la ruta '/variables/string/{text}/{number}' y es similar al segundo método,
    pero también recibe un parámetro de ruta adicional llamado 'number' a través del parámetro de anotación @PathVariable.
    El mensaje en el atributo 'result' incluye tanto el valor de 'text' como el de 'number'. Luego, devuelve la vista 'variables/ver'*/
    @GetMapping("/string/{text}/{number}")
    public String variables(@PathVariable String text, @PathVariable Integer number, Model model){
        model.addAttribute("title", "Recibir parámetros del Request (@PathVariable)");
        model.addAttribute("result",
                "El texto enviado en la ruta es: " + text
                        + " y el numer enviado en el path es: " + number);
        return "variables/ver";
    }

}
