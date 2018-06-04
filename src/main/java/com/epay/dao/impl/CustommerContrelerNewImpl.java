/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.dao.impl;

/**
 *
 * @author ADITYA
 */
import com.epay.model.Customer;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CustommerContrelerNewImpl {
    
//      @Select("select a.description , a.id_toko,a.nama_obat,a.stock,a.harga,b.toko from epay1.master_stock a ,"
//            + "epay1.master_toko b where a.id_toko = b.id_toko::character varying and a.flagdelete = '0' "
//            + "and a.nama_obat = #{c.nama_obat} and a.harga =#{c.harga}")
//    public List<Customer> getDataCustommerIDNew(@Param("c") Customer c);
//    
}
