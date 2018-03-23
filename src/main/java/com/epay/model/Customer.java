/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.model;

/**
 *
 * @author ADITYA
 */
public class Customer{
    private String harga;
    private String id_toko, nama_obat, stock,toko, description;
    public Customer() {	}    
    public Customer(String id_toko, String nama_obat, String stock,String harga, String toko , String description) {
        this.id_toko = id_toko;
        this.nama_obat = nama_obat;
        this.harga = harga;
        this.stock = stock;
        this.toko = toko;
        this.description = description;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    
    /**
     * @return the id_toko
     */
    public String getId_toko() {
        return id_toko;
    }

    /**
     * @param id_toko the id_toko to set
     */
    public void setId_toko(String id_toko) {
        this.id_toko = id_toko;
    }

    /**
     * @return the nama_obat
     */
    public String getNama_obat() {
        return nama_obat;
    }

    /**
     * @param nama_obat the nama_obat to set
     */
    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    /**
     * @return the stock
     */
    public String getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(String stock) {
        this.stock = stock;
    }

    /**
     * @return the toko
     */
    public String getToko() {
        return toko;
    }

    /**
     * @param toko the toko to set
     */
    public void setToko(String toko) {
        this.toko = toko;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
