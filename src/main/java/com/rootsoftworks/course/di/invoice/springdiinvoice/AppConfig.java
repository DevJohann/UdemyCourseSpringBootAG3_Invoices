package com.rootsoftworks.course.di.invoice.springdiinvoice;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
}
