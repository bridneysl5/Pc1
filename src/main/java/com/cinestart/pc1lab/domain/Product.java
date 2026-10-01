package com.cinestart.pc1lab.domain;

import jakarta.persistence.*;

@Entity
@Table(name="productos")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    //storeld

    @Column(nullable=false)
    private String name;

    @Column
    private Integer price;

    @Column
    private String status;


    protected Product(){}
    public Product(String name, Integer price, String status){
        this.name = name;
        this.price = price;
        this.status=status;
    }

    public Long getId() {return Id;}
    public String getName(){return name;}
    public Integer getPrice(){return price;}
    public String getStatus(){return status;}

}

