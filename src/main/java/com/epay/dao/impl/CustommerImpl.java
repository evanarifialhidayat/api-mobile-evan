/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.dao.impl;

import com.epay.model.Customer;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustommerImpl {
   
    @Select("select a.description , a.id_toko,a.nama_obat,a.stock,a.harga,b.toko from epay1.master_stock a ,"
            + "epay1.master_toko b where a.id_toko = b.id_toko::character varying and a.flagdelete = '0' ")
     public List<Customer> getDataCustommer();
    
     @Select("select a.description , a.id_toko,a.nama_obat,a.stock,a.harga,b.toko from epay1.master_stock a ,"
            + "epay1.master_toko b where a.id_toko = b.id_toko::character varying and a.flagdelete = '0' "
            + "and a.nama_obat = #{c.nama_obat}")
    public List<Customer> getDataCustommerID(@Param("c") Customer c);
    
    @Insert("INSERT INTO epay1.master_toko(toko) VALUES (#{c.toko})")
    public void dataPostCustommer(@Param("c") Customer c);
    
  
    
}
