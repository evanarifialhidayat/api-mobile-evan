/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.controller;

/**
 *
 * @author ADITYA
 */

import com.epay.dao.impl.CustomerControllerImpl;
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


//@RestController
public class CustomerController{

//      @Autowired
//      CustomerControllerImpl mapper;

//    public void setMapper(CustomerControllerImpl mapper) {
//        this.mapper = mapper;
//    }
//
//    @GetMapping("/customers1")
//    public List getDataCustommerAll() {
//        return mapper.getDataCustommerAll();
//    }
//
//    @GetMapping("/customers2/{nama_obat}")
//    public List getListDataCustommerID(@PathVariable String nama_obat) {
//        Customer p = new Customer();
//        p.setNama_obat(nama_obat);
//        return mapper.getListDataCustommerID(p);
//    }
//    
//    
//    
//       @PostMapping(value = "/postCustomer")//[{"data":""},{"data":""}]
//        public ResponseEntity insertDataPostCustommer(@RequestBody List<Customer> customers) {
//         System.out.println("--------------------------------"+customers.size());
//            Customer cus;
//            for(int p=0; p<customers.size(); p++){
//                cus = (Customer) customers.get(p);
//                mapper.insertDataPostCustommer(cus);
//            }         
//           return new ResponseEntity(customers, HttpStatus.OK); 
//        }
    
  
}
