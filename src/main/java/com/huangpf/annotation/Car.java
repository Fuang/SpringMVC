/*
* Copyright (c) 2016 Huangpf. All Rights Reserved.
*/
package com.huangpf.annotation;

/**
 * TODO 类的描述
 *
 * @author: Huangpf  Date: 2016/6/23 Time: 9:27.
 */
public class Car {

    private String brand;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "brand:" + brand + "," + "price:" + price;
    }
}
