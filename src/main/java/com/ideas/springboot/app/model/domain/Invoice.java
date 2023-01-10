package com.ideas.springboot.app.model.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;
import java.util.List;

@Component
@RequestScope //Vivirá durante el tiempo de vida de una sola solicitud HTTP. Esto significa que se creará una nueva instancia del objeto para cada solicitud HTTP
public class Invoice implements Serializable {
    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Customer customer;
    @Autowired
    private List<ItemInvoice> items;


    @PostConstruct // Este método se ejecutará después de que se haya construido el objeto que lo contiene
    public void init(){
        // Modificamos el nombre del cliente para incluir "Lorena"
        customer.setName(customer.getName().concat(" ").concat("Lorena"));
        // Modificamos la descripción de la factura para incluir el nombre del cliente
        description = description.concat(" del cliente: ").concat(customer.getName());
    }


    @PreDestroy // Este método se ejecutará justo antes de que se destruya el objeto que lo contiene
    public void destroy(){
        // Imprimimos un mensaje de salida con la descripción de la factura
        System.out.println("Factira destruida: ".concat(description));
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ItemInvoice> getItems() {
        return items;
    }

    public void setItems(List<ItemInvoice> items) {
        this.items = items;
    }
}
