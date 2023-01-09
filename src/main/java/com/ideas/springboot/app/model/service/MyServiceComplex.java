package com.ideas.springboot.app.model.service;

//@Service("miServicioComplejo")
public class MyServiceComplex implements IMyService{

    @Override
    public String operation(){
        return "Ejecutando algún proceso importante complejo...";
    }

}

