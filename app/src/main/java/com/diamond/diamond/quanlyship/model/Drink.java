package com.diamond.diamond.quanlyship.model;

public class Drink {
    private int img;
    private String namedrink, price;

    public Drink(int img, String namedrink, String price) {
        this.img = img;
        this.namedrink = namedrink;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNamedrink() {
        return namedrink;
    }

    public void setNamedrink(String namedrink) {
        this.namedrink = namedrink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
