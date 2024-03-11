package com.Galaksiya.ws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String categoryName;


    public Category() {

    }

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", CategoryName='" + categoryName + '\'' +
                '}';
    }



}
