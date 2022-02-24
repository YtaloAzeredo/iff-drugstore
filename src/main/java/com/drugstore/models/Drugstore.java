package com.drugstore.models;


import java.io.Serializable;
import java.util.Objects;

public class Drugstore implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String fantasyName;
    private String cnpj;
    private String cellphone;

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
