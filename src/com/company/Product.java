package com.company;

public class Product {
    private String tittle;
    public String getTitle() {
        return tittle;
    }

    public void setTitle(String title) {
        this.tittle = tittle;

    }

    private double price;
    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

   private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getCost() {
        return quantity*price;
    }

    public String getTittle() {
        return tittle;
    }

}
