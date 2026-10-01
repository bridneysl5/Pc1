package com.cinestart.pc1lab.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Tienda")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, unique = true)
    private String name;

    //ownerld

    @Column
    private String location;

    @Column
    private String status;

    protected Store(){} //JPA

    public Store (String name, String location, String status){
        this.name = name;
        this.location = location;
        this.status = status;
    }

    public Long getId() {return Id;}
    public String getName() {return name;}
    public String getLocation(){ return location;}
    public String getStatus(){return status;}



}
