/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.controller;

/**
 *
 * @author ADITYA
 */
import com.epay.dao.impl.conLoginImpl;
import com.epay.enkripsi.Enkripsi;
import com.epay.model.mst_tbl_user;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class conLogin{

      @Autowired
      conLoginImpl mapper;

    public void setMapper(conLoginImpl mapper) {
        this.mapper = mapper;
    }
    
    @GetMapping("/customers2/getlogin/{email}/{pass}")
     public List getDataLoginVerivikasi(@PathVariable String email,@PathVariable String pass) {
        mst_tbl_user p = new mst_tbl_user();
        p.setUsername(email);
        p.setPwd(""+new Enkripsi("APR").encrypt(pass));
        List ppp = new ArrayList();
        if(mapper.getDataLoginVerivikasi(p).size()== 0){
            p.setVerivikasi("Gagal");
            ppp.add(p.getVerivikasi()); 
        }else{
             p.setVerivikasi("Sukses");
            ppp.add(p.getVerivikasi()); 
        }
        return ppp;
     }
      
}
