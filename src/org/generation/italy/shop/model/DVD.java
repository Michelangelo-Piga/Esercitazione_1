package org.generation.italy.shop.model;

public class DVD extends GeneralProduct{

    private String title;
    private String category;
    private double duration;

    public DVD(){
        super();
    }

    public DVD(double weight, double price, String title, String category, double duration) {
        super(weight, price);
        this.title = title;
        this.category = category;
        this.duration = duration;
    }

    @Override
    public String getAttribute() {
        return null;
    }



    public String getTitle() {
        return title;
    }

    /*public void setTitle(String title) {
        this.title = title;
    }
*/
    public String getCategory() {
        return category;
    }

/*
    public void setCategory(String category) {
        this.category = category;
    }
*/
    public double getDuration() {
        return duration;
    }

/*
    public void setDuration(double duration) {
        this.duration = duration;
    }
    */
}
