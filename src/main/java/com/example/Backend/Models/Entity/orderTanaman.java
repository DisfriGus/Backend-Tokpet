package com.example.Backend.Models.Entity;

public class orderTanaman {
    private Tanaman tanaman;
    private int quantity;

    public orderTanaman(Tanaman tanaman, int quantity) {
        this.tanaman = tanaman;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
