package com.ideas.springboot.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("miServicioSimple") // Indica que la clase es un bean de servicio de Spring y le da el nombre "miServicioSimple"
//@Primary // Indica que este bean de servicio debe ser utilizado como principal en caso de conflicto de inyección de dependencias como lo estamos usando con @Qualifier lo comente
public class MyService implements IMyService{

    @Override // Sobrescribe el método "operation()" de la interfaz IMyService
    public String operation(){
        // Ejecuta proceso devuelve un resultado
        return "Ejecutando algún proceso importante simple...";
    }

}

