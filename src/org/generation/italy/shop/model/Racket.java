package org.generation.italy.shop.model;

public class Racket extends  GeneralProduct{


    private String brand;

    private String type;

    public Racket(){
        super();
    }

    public Racket(double weight, double price, String brand, String type) {
        super(weight, price);
        this.brand = brand;
        this.type = type;
    }
    @Override
    public String getAttribute() {
        return null;
    }



    public String getBrand() {
        return brand;
    }
/*
   public void setBrand(String brand) {
        this.brand = brand;
    }

 */

    public String getType() {
        return type;
    }

    /*
       public void setType(String[] type) {
        this.type = type;
    }
     */



}
