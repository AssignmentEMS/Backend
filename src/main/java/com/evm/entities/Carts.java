package com.evm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "Carts")
@Table(name = "Carts")
public class Carts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;

    private Items items_id;

    private Integer quantity;


}
