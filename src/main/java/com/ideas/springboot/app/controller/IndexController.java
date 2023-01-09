package com.ideas.springboot.app.controller;

import com.ideas.springboot.app.model.service.IMyService;
import com.ideas.springboot.app.model.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Indica que la clase es un controlador de Spring MVC
public class IndexController {
    @Autowired // Indica que el objeto de servicio se debe inyectar automáticamente
    @Qualifier("miServicioComplejo")  // Especifica que se debe utilizar el bean de servicio con el nombre "miServicioComplejo"
    private IMyService service; // La clase depende de un objeto de servicio implementado por la interfaz IMyService

    @GetMapping({"/","","/index"}) // Indica que el método maneja solicitudes GET a las rutas "/", "", y "/index"
    public String index(Model model){
        // Llama al método "operation()" del servicio y agrega el resultado al modelo
        model.addAttribute("object", service.operation());
        return "index";
    }

}
