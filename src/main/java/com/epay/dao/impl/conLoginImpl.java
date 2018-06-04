/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.dao.impl;

/**
 *
 * @author ADITYA
 */
import com.epay.model.mst_tbl_user;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface conLoginImpl { 

      @Select("SELECT username FROM tbluser where username = #{c.username} and pwd = #{c.pwd}")   
      public List<mst_tbl_user>  getDataLoginVerivikasi(@Param("c") mst_tbl_user c);
     
}
