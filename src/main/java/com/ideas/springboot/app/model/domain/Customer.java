package com.ideas.springboot.app.model.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope //Vivirá durante el tiempo de vida de una sola solicitud HTTP. Esto significa que se creará una nueva instancia del objeto para cada solicitud HTTP
public class Customer {
    @Value("${customer.name}")
    private String name;
    @Value("${customer.surname}")
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
