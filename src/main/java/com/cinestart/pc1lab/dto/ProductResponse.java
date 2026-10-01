package com.cinestart.pc1lab.dto;

public class ProductResponse ( Long Id, String name, String price, String status) {
    public static ProductResponse from (product p){

        return new ProductResponse (p.getId(), p.getName (), p.getPrice(), p.getStatus());
    }


}
