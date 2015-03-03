package com.caram.model;

/**
 * Created by collin on 3/2/2015.
 */

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="Tickets")
public class Ticket {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String cashier;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }
}
