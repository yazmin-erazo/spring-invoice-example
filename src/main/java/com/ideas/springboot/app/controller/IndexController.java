package com.ideas.springboot.app.controller;

import com.ideas.springboot.app.model.service.IMyService;
import com.ideas.springboot.app.model.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    private IMyService service;

    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("object", service.operation());
        return "index";
    }

}
