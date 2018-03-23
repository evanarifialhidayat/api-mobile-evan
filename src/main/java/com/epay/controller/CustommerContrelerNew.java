/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.controller;

/**
 *
 * @author ADITYA
 */
import com.epay.dao.impl.CustommerContrelerNewImpl;
import com.epay.dao.impl.CustommerImpl;
import com.epay.model.Customer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustommerContrelerNew {
    
      @Autowired
      private CustommerContrelerNewImpl mapper2;

  
//      @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("employee")Employee employee, 
//      BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        model.addAttribute("name", employee.getName());
//        model.addAttribute("contactNumber", employee.getContactNumber());
//        model.addAttribute("id", employee.getId());
//        return "employeeView";
//    }
//      http://localhost:8080/spring-mvc-xml/addEmployee
      
      
    @GetMapping("/customers3/{nama_obat}/{harga}")
    public List getDataCustommerID(@PathVariable String nama_obat,@PathVariable String harga) {
        Customer p = new Customer();
        p.setNama_obat(nama_obat);
        p.setHarga(harga);
        return mapper2.getDataCustommerIDNew(p);
    }

    /**
     * @param mapper2 the mapper2 to set
     */
    public void setMapper2(CustommerContrelerNewImpl mapper2) {
        this.mapper2 = mapper2;
    }
    
}
