package com.example.springboot.models;

import java.io.Serializable;
import java.util.UUID;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "PRODUCTS_TABLE")

public class ProductModel extends RepresentationModel<ProductModel> implements Serializable{

    private static final long serialVersionVID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

//Getters

    public UUID getIdProduct(){
        return idProduct;
    }

    public String getName(){
        return name;
    }

    public BigDecimal getValue(){
        return value;
    }

//Setters

    public void setIdProduct(UUID idProduct){
        this.idProduct = idProduct;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setValue(BigDecimal value){
        this.value = value;
    }

}