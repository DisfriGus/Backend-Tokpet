package com.example.Backend.Models.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "order")
public class Order {
    @Id
    private String id;
    private orderTanaman[] produk;
    private String status;
    private Date tanggalPemesanan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public orderTanaman[] getProduk() {
        return produk;
    }

    public void setProduk(orderTanaman[] produk) {
        this.produk = produk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(Date tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }
}
