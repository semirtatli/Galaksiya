package com.Galaksiya.ws.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;



@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String productName;

    private Long productCategoryID;
    private BigDecimal productPrice;
    @NotBlank
    private String productColor;

    private Long productStock;
//add this line to frontend it engelliyor for frontend to fetch the data
//    @OneToMany(mappedBy = "product")
//    private List<SoldProduct> soldProducts;
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productCategoryID='" + productCategoryID + '\'' +
                ", productPrice=" + productPrice +
                ", productColor='" + productColor + '\'' +
                ", productStock=" + productStock +
                '}';
    }



    public Product(Long id,
                   String productName,
                   Long productCategoryID,
                   BigDecimal productPrice,
                   String productColor,
                   Long productStock){
        this.id = id;
        this.productName = productName;
        this.productCategoryID = productCategoryID;
        this.productPrice = productPrice;
        this.productColor = productColor;
        this.productStock = productStock;
    }

    public Product() {

    }


}
