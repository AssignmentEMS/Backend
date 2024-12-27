package com.evm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "Transactions")
@Table(name = "Transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Orders order_id;
    
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_id;

    private String payment_Method;

    private Long amount;

    private String status;

}
