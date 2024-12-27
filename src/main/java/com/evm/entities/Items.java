package com.evm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "Items")
@Entity(name = "Items")
public class Items {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "vendor_id", referencedColumnName = "id")
    private Vendors vendor_id;

    private String name;
    
    private String description_item;

    private Long price;

    private Integer quantity_availaible;

    private String availaibility_status;
    

}
