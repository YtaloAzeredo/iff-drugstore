package com.drugstore.models;


import java.io.Serializable;
import java.util.Objects;

public class Drugstore implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String fantasyName;
    private String cnpj;
    private String cellphone;

    private Address address;
    private Products products;
    private Orders orders;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drugstore)) return false;
        Drugstore drugstore = (Drugstore) o;
        return id.equals(drugstore.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
