package com.ideas.springboot.app.controller;

import com.ideas.springboot.app.model.domain.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/detail")
    public String seeDetails(Model model){
        model.addAttribute("invoice", invoice);
        model.addAttribute("title", "Ejemplo factura con inyección de dependencia");
        return "invoice/detail";
    }

}
