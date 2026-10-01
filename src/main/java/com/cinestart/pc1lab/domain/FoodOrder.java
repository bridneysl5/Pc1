package com.cinestart.pc1lab.domain;

import jakarta.persistence.*;

@Entity
@Table(name="food_orders")
public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

}
