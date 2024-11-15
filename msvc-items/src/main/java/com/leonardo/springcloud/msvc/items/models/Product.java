package com.leonardo.springcloud.msvc.items.models;

import java.time.LocalDate;

public class Product {

    private long id;
    private String name;
    private Double price;
    private LocalDate createAt;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocalDate getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

}
