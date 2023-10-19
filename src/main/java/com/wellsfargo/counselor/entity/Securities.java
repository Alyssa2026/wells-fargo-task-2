package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Securities {

    @Id
    @GeneratedValue()
    private long secID;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private String purchaseDate;

    protected Securities() {

    }

    public Securities(long secID, String symbol, String type, int quantity, int price, int total, String purchaseDate) {
       this.secID=secID;
       this.symbol= symbol;
       this.type=type;
       this.quantity=quantity;
       this.price=price;
       this.total=total;
       this.purchaseDate=purchaseDate;
    }

    public Long getSecId() {
        return this.secID;
    }

    public String getSymbol() {
        return this.symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setTotal(int total){this.total= total}
    public int getTotal(){return this.total}

    public String getPurchaseDate(){return this.purchaseDate}
    public String setPurchaseDate(String purchaseDate){this.getPurchaseDate=purchaseDate}
}
