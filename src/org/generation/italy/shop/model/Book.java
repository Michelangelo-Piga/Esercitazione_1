package org.generation.italy.shop.model;

public class Book extends GeneralProduct{
    private String isbn;
    private String title;
    private String category;
    private int pagesNumber;


    public Book(){
        super();
    }
    public Book(double weight, double price, String isbn, String title, String category, int pagesNumber) {
        super(weight, price);
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.pagesNumber = pagesNumber;
    }
    @Override
    public String getAttribute() {
        return null;
    }



    public String getIsbn() {
        return isbn;
    }

    /*
    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }
*/
    public String getTitle() {
        return title;
    }
/*
    public void setTitle(String title) {
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


    public int getPagesNumber() {
        return pagesNumber;
    }
/*
   public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
 */



}
