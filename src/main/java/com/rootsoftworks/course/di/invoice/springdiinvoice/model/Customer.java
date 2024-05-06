package com.rootsoftworks.course.di.invoice.springdiinvoice.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@RequestScope
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Customer {
    
    @Value("${customer.name}")
    private String customerName;

    @Value("${customer.surname}")
    private String customerSurname;



    
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerSurname() {
        return customerSurname;
    }
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    
}
