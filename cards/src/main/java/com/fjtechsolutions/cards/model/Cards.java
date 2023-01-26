package com.fjtechsolutions.cards.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="cards")
public class Cards {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="card_id")
    private long cardId;
    @Column(name="customer_id")
    private long customerId;
    @Column(name="card_number")
    private long cardNumber;
    @Column(name="card_type")
    private String cardType;
    @Column(name="total_limit")
    private int totalLimit;
    //@Column(name="ammount_used")
    //private int amountUsed;
    @Column(name="available_amount")
    private long availableAmount;
    @Column(name="create_dt")
    private Date creteDt;


}
