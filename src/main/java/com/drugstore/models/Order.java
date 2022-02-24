package com.drugstore.models;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Date purchaseDate;
    private Calendar start;
    private Calendar end;

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

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }
}
