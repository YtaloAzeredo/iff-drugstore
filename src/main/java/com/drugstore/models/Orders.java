package com.drugstore.models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Date purchaseDate;
    private Calendar startOrder;
    private Calendar endOrder;

    private Products products;

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Calendar getStartOrder() {
        return startOrder;
    }

    public void setStartOrder(Calendar startOrder) {
        this.startOrder = startOrder;
    }

    public Calendar getEndOrder() {
        return endOrder;
    }

    public void setEndOrder(Calendar endOrder) {
        this.endOrder = endOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return id.equals(orders.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
