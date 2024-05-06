package com.rootsoftworks.course.di.invoice.springdiinvoice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Invoice {
    
    @Autowired
    private Customer customer;

    @Value("${invoice.office}")
    private String desc;

    @Autowired
    @Qualifier("itemInvoiceOffice")
    private List<Item> items;

    
    public Invoice() {
        System.out.println(customer);
    }


    @PostConstruct
    public void init(){
        customer.setCustomerName(customer.getCustomerName().concat(" Pepe"));
        desc = desc.concat(" del cliente: ".concat(customer.getCustomerName()));
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destruyendo bean: Invoice");
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public int getTotalPrice(){
        return items.stream().map(item -> item.getTotalPrice()).reduce(0, (sum, item) -> sum + item);
    }
    
}
