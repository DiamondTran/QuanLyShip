package com.diamond.diamond.quanlyship.model;

public class Food {
    private int img;
    private String namefood, price;

    public Food(int img, String namefood, String price) {
        this.img = img;
        this.namefood = namefood;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNamefood() {
        return namefood;
    }

    public void setNamefood(String namefood) {
        this.namefood = namefood;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
