package com.evm.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity(name = "Memberships")
@Table(name = "Memberships")
public class Memberships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User vendorId;

    private Integer duration;

    private LocalDate start_date;

    private LocalDate end_date;

    private String membershipStatus;
}
