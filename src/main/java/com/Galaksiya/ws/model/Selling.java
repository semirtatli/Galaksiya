package com.Galaksiya.ws.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.*;
import java.util.List;


@Data
@Entity
public class Selling {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "selling")
    private List<SoldProduct> soldProducts;

}
