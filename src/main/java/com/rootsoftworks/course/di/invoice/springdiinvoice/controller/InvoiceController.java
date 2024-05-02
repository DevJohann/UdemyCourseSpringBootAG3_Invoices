package com.rootsoftworks.course.di.invoice.springdiinvoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rootsoftworks.course.di.invoice.springdiinvoice.model.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private Invoice invoice;
    
    @GetMapping("/show")
    public Invoice show(){
        return invoice;
    }
}
