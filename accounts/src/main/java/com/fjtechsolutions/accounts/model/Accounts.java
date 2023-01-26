package com.fjtechsolutions.accounts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="account_number")
    private int accountNumber;

    @Column(name="branch_address")
    private String branchAddress;

    @Column(name="customer_id")
    private int customerId;


    @Column(name="account_type")
    private String accountType;


    @Column(name="create_dt")
    private Date createDt;


}
