/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.controller;

/**
 *
 * @author ADITYA
 */

import com.epay.dao.impl.CustommerImpl;
import com.epay.model.Customer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController{

      @Autowired
      CustommerImpl mapper;

    public void setMapper(CustommerImpl mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/customers1")
    public List getDataCustommer() {
        return mapper.getDataCustommer();
    }

    @GetMapping("/customers2/{nama_obat}")
    public List getDataCustommerID(@PathVariable String nama_obat) {
        Customer p = new Customer();
        p.setNama_obat(nama_obat);
        return mapper.getDataCustommerID(p);
    }
    
//    @PostMapping(value = "/postCustomer") //{"data":""}
//    public ResponseEntity getPostCustommer(@RequestBody Customer customer) {        
//        mapper.dataPostCustommer(customer);
//        return new ResponseEntity(customer, HttpStatus.OK);     
//    }
    
    
       @PostMapping(value = "/postCustomer")//[{"data":""},{"data":""}]
        public ResponseEntity getPostCustommer(@RequestBody List<Customer> customers) {
         System.out.println("--------------------------------"+customers.size());
            Customer cus;
            for(int p=0; p<customers.size(); p++){
                cus = (Customer) customers.get(p);
                mapper.dataPostCustommer(cus);
            }         
           return new ResponseEntity(customers, HttpStatus.OK); 
        }
    
  
}
