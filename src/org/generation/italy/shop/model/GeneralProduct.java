package org.generation.italy.shop.model;

public abstract class GeneralProduct {

    private double weight;
    private double price;

    public GeneralProduct() {

    }
    public GeneralProduct(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }



    public double getWeight() {

        return weight;
    }
/*
    public void setWeight(double weight) {
        this.weight = weight;
    }

  */
public double getPrice() {
        return price;
    }

    /*
    public void setPrice(double price) {
        this.price = price;
    }

*/

    public abstract String getAttribute();
}
