package com.ideas.springboot.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
//@Service("miServicioSimple")
public class MyService implements IMyService{

    @Override
    public String operation(){
        return "Ejecutando algún proceso importante simple...";
    }

}

