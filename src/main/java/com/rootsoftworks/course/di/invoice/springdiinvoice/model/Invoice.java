package com.rootsoftworks.course.di.invoice.springdiinvoice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {
    
    @Autowired
    private Customer customer;

    @Value("${invoice.desc}")
    private String desc;

    @Autowired
    private List<Item> items;




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
        return 0;
    }
    
}
