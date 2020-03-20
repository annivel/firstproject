package com.company;

import java.util.Date;

public class Deal {
    private final Date date = new Date();


    public Deal(Party buyer, Party seller, Product[] products) {
        super();
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
    }

    public double getSum() {
            double res = 0;
            for (Product pr : products) {
                res += pr.getCost();
            }
            return res;
        }

    public Date getDate() {
        return date;
    }

    private final Party seller;

    public Party getSeller() {
        return seller;
    }

    private final Party buyer;

    public Party getBuyer() {
        return buyer;
    }

    private final Product[] products;

    public Product[] getProducts() {
        return products;

    }



    }




