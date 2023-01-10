package com.ideas.springboot.app;

import com.ideas.springboot.app.model.domain.ItemInvoice;
import com.ideas.springboot.app.model.domain.Product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration // Esta clase es una clase de configuración de Spring
public class AppConfig {

    @Bean("itemsInvoice") // Este método registra una lista de items de factura como un bean de Spring
    public List<ItemInvoice> registerItems() {
        // Creamos dos productos
        Product product1 = new Product("Camara Sony", 100);
        Product product2 = new Product("Bicicleta Bianchi aro 26", 200);

        // Creamos dos items de factura con los productos anteriores
        ItemInvoice linea1 = new ItemInvoice(product1, 2);
        ItemInvoice linea2 = new ItemInvoice(product2, 4);

        // Devolvemos la lista de items de factura
        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsInvoiceOffice") // Este método registra una lista de items de factura para oficina como un bean de Spring
    @Primary // y lo marca como el bean principal para este tipo de objeto
    public List<ItemInvoice> registerItemsOffice(){
        // Creamos cuatro productos
        Product product1 = new Product("Monitor LG LCD 24", 250);
        Product product2 = new Product("Notebook Asus", 500);
        Product product3 = new Product("Impresora HP Multifuncional", 80);
        Product product4 = new Product("Escritorio Oficina", 300);

        // Creamos cuatro items de factura con los productos anteriores
        ItemInvoice linea1 = new ItemInvoice(product1, 2);
        ItemInvoice linea2 = new ItemInvoice(product2, 1);
        ItemInvoice linea3 = new ItemInvoice(product3, 1);
        ItemInvoice linea4 = new ItemInvoice(product4, 1);

        // Devolvemos la lista de items de factura para oficina
        return Arrays.asList(linea1,linea2,linea3,linea4);
    }

}

//La clase AppConfig es una clase de configuración de Spring que se encarga de registrar beans de servicio en el contenedor de Spring. Los beans de servicio son objetos que se crean y administran por Spring y que pueden ser utilizados en otras partes de la aplicación para realizar tareas de negocio.