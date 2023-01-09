package com.ideas.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration // Indica que la clase es una clase de configuración de Spring
@PropertySources({ // Especifica fuentes de archivos de propiedades para cargar en la aplicación
        @PropertySource("classpath:messages.properties") // Carga el archivo de propiedades "messages.properties" del classpath
})
public class MessagePropertiesConfig {

    // La clase en sí no tiene ningún método, por lo que se utiliza simplemente para especificar que se deben cargar archivos de propiedades

}
