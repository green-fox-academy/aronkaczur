package com.greenfoxacademy.basicwebshop.model;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class ShopItem {
    String name;
    String description;
    Integer price;
    Integer quantityOfStock;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(Integer quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }


    public ShopItem(String name, String description, Integer price, Integer quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

}