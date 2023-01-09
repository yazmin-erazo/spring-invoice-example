package com.ideas.springboot.app.controller;

import com.ideas.springboot.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

// Clase controladora para manejar solicitudes de inicio de sesión
@Controller
@RequestMapping("/app")
public class IndexController {

    /**
     * Maneja solicitudes GET a /app/index, /app/, /app/home
     * @return el nombre de la vista "index"
     */
    @GetMapping({"/index", "/", "/home"})
    public String index(Model model){
        // Agrega el título "Hola spring framework" al modelo de vista
        model.addAttribute("title", "Hola spring framework");
        // Devuelve el nombre de la vista "index"
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model){

        // Crea un nuevo usuario
        User user = new User();
        user.setName("Yazmin");
        user.setSurname("Erazo");
        user.setEmail("ylerazom@email.com");
        // Agrega el usuario y el título al modelo de vista
        model.addAttribute("user", user);
        model.addAttribute("title", "Perfil de usuario: ".concat(user.getName()));

        // Devuelve el nombre de la vista "perfil"
        return "perfil";
    }


    @GetMapping("/listar")
    public String list(Model model) {
        // Agrega el título "Listado de usuarios" al modelo de vista
        model.addAttribute("title", "Listado de usuarios");
        // Devuelve el nombre de la vista "listar"
        return "listar";
    }

    // Método de apoyo que agrega una lista de usuarios al modelo de vista
    @ModelAttribute("users")
    public List<User> populateUsers(){
        // Crea y devuelve una lista de usuarios
        List<User> users = Arrays.asList(
                new User("Carlos", "González", "carlos@email.com" ),
                new User("Jane", "Austin", "jane@email.com" ),
                new User("Yazmin", "Erazo", "ylerazo@email.com" )
        );
        return users;
    }
}
