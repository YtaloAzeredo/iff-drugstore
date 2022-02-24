package com.drugstore.models;

import java.io.Serializable;
import java.util.Objects;

public class Documents implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String cpf;
    private String rg;
    private String cnh;
    private String contract;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Documents)) return false;
        Documents documents = (Documents) o;
        return id.equals(documents.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
