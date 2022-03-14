package com.example.recycleview;

public class ElectricThing {
    private String productName;
    private int imgThing;
    private String price;
    private String discount;

    public String getProductName() {
        return productName;
    }

    public int getImgThing() {
        return imgThing;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImgThing(int imgThing) {
        this.imgThing = imgThing;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public ElectricThing(String productName, int imgThing, String price, String discount) {
        this.productName = productName;
        this.imgThing = imgThing;
        this.price = price;
        this.discount = discount;
    }

    public ElectricThing() {
    }
}
