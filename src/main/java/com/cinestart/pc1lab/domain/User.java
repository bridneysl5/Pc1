package com.cinestart.pc1lab.domain;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    @Column(nullable=false,unique=true)
    private String username;


    @Column(nullable=false,unique=true)
    private String email;

    @Column
    private String password;

    @Column
    private String role;

    protected User(){}//JPA

    public User( String username, String email, String password, String role){

        this.username = username;
        this.email=email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {return Id;}
    public String getUsername(){return username;}
    public String getEmail (){return email;}
    public String getPassword(){return password;}
    public String getRole(){return role;}


}
