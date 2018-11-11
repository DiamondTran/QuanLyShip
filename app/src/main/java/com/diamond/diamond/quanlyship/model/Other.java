package com.diamond.diamond.quanlyship.model;

public class Other {
    private int img;
    private String nameother, price;

    public Other(int img, String nameother, String price) {
        this.img = img;
        this.nameother = nameother;
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNameother() {
        return nameother;
    }

    public void setNameother(String nameother) {
        this.nameother = nameother;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
