package com.ideas.springboot.app;

import com.ideas.springboot.app.model.service.IMyService;
import com.ideas.springboot.app.model.service.MyService;
import com.ideas.springboot.app.model.service.MyServiceComplex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    public IMyService registerMyService(){
        return new MyService();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IMyService registerMyServiceComplex(){
        return new MyServiceComplex();
    }

}

//La clase AppConfig es una clase de configuración de Spring que se encarga de registrar beans de servicio en el contenedor de Spring. Los beans de servicio son objetos que se crean y administran por Spring y que pueden ser utilizados en otras partes de la aplicación para realizar tareas de negocio.
