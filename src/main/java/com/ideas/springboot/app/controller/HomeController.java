package com.ideas.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Indica que la clase es un controlador de Spring MVC
public class HomeController {

    @GetMapping("/") // Indica que el método maneja solicitudes GET a la ruta raíz ("/")
    public  String home(){
        //return "redirect:https://www.google.com";

        // Redirect: Se ve cuando se ha hecho un cambio de dirección (por ejemplo, después de enviar un formulario)
        //return "redirect:/app/index";

        //Forward: Cuando se procesa la solicitud en una URL diferente, pero no se refleja en la dirección URL (por ejemplo, para mostrar contenido dinámico que se ha generado en el servidor)
        return "forward:/app/index";
    }
}