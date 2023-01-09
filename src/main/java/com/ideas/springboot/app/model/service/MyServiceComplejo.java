package com.ideas.springboot.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("miServicioComplejo") // Indica que la clase es un bean de servicio de Spring y le da el nombre "miServicioComplejo"
public class MyServiceComplejo implements IMyService{

    @Override // Sobrescribe el método "operation()" de la interfaz IMyService
    public String operation(){
        // Ejecuta proceso y devuelve un resultado
        return "Ejecutando algún proceso importante complejo...";
    }

}

