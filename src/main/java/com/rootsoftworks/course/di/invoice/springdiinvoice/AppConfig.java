package com.rootsoftworks.course.di.invoice.springdiinvoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.rootsoftworks.course.di.invoice.springdiinvoice.model.Item;
import com.rootsoftworks.course.di.invoice.springdiinvoice.model.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
    
    @Bean
    List<Item> itemInvoice(){
        Product p1 = new Product("Cámara", 300);
        Product p2 = new Product("Mercedes Benz", 300000);
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4));
    }

    @Bean
    //@Primary
    List<Item> itemInvoiceOffice(){
        Product p1 = new Product("Monitor Lenovo Thinkvision", 300);
        Product p2 = new Product("Lenovo Thinkpad X1", 3000);
        Product p3 = new Product("Impresora", 3000);
        Product p4 = new Product("Desktop", 3000);
        return Arrays.asList(new Item(p1, 4), new Item(p2, 6), new Item(p3, 6), new Item(p4, 2));
    }
}
