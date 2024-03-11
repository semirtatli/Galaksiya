package com.Galaksiya.ws.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SoldProduct {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Product product;

    private Long numberOfProduct;


    @ManyToOne
    private Selling selling;
}

