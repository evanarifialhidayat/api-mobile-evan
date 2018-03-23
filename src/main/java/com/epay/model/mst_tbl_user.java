/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.model;

/**
 *
 * @author ADITYA
 */
public class mst_tbl_user {
    public mst_tbl_user(){}
       private String username ;
  private Long groupid;
   private String pwd;
    private Long userid,aprvalidasi,aprvalidasiuser,aprvalidasiuserguest;
    private String schema,schemaid;
    private String signemailadmin;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getAprvalidasi() {
        return aprvalidasi;
    }

    public void setAprvalidasi(Long aprvalidasi) {
        this.aprvalidasi = aprvalidasi;
    }

    public Long getAprvalidasiuser() {
        return aprvalidasiuser;
    }

    public void setAprvalidasiuser(Long aprvalidasiuser) {
        this.aprvalidasiuser = aprvalidasiuser;
    }

    public Long getAprvalidasiuserguest() {
        return aprvalidasiuserguest;
    }

    public void setAprvalidasiuserguest(Long aprvalidasiuserguest) {
        this.aprvalidasiuserguest = aprvalidasiuserguest;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getSchemaid() {
        return schemaid;
    }

    public void setSchemaid(String schemaid) {
        this.schemaid = schemaid;
    }

    public String getSignemailadmin() {
        return signemailadmin;
    }

    public void setSignemailadmin(String signemailadmin) {
        this.signemailadmin = signemailadmin;
    }

    public String getVerivikasi() {
        return verivikasi;
    }

    public void setVerivikasi(String verivikasi) {
        this.verivikasi = verivikasi;
    }
    private String verivikasi;
}
