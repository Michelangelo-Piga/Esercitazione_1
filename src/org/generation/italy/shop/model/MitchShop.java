package org.generation.italy.shop.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MitchShop {
    public static void main(String[] args) {



        ArrayList<GeneralProduct> products = new ArrayList<>();
        showSizeOfProducts(products);


        /*
        creating the obj books, dvds, rackets
         */
        Book book1 = new Book(5.3,10.50, "asdfgh", "Lord Of The Rings", "Fantasy", 1376 );
        Book book2 = new Book(6.3,20.50, "ghjkl", "It", "Horror", 1315 );
        Book book3 = new Book(7.3,5.80, "ertyu", "The Jungle Book", "Adventure", 153  );


        DVD dvd1 = new DVD(0.8,15.99,"Imagine Dragons", "Alternativa/indie", 50.55);
        DVD dvd2 = new DVD(0.5,15.99,"Guns N'Roses", "Rock", 75.32);
        DVD dvd3 = new DVD(0.4,15.99,"Pantera", "Metal", 64.15);
        DVD dvd4 = new DVD(0.3,15.99,"BlackPink", "K-pop", 38.10);


        Racket racket1 = new Racket(0.400, 120.00,"Adidas","Round");
        Racket racket2 = new Racket(0.700, 90.00,"Nike","Diamond");
        Racket racket3 = new Racket(0.400, 101.99,"Alacran","Drop");

        /*
        adding products to the alist products
         */
        addProduct(products, book1);
        addProduct(products,book2);
        addProduct(products,book3);
        System.out.println("Organaizing books...");
        System.out.println("books are ready!");
        showSizeOfProducts(products);

        addProduct(products,dvd1);
        addProduct(products,dvd2);
        addProduct(products,dvd3);
        System.out.println("Organaizing dvds...");
        System.out.println("dvs are ready!");
        showSizeOfProducts(products);


        addProduct(products,racket1);
        addProduct(products,racket2);
        addProduct(products,racket3);
        System.out.println("Organaizing rackets...");
        System.out.println("rackets are ready!");
        showSizeOfProducts(products);


        System.out.println("The shop is now full of products!");
        showSizeOfProducts(products);


        int choiceMenu = 0;
        int choiceAddProduct = 0;
        System.out.println("Welcome to the Mitch's Shop, how i can serve you today?");
        System.out.println("Choose what you want: ");

        Scanner scanner = new Scanner((System.in));

        showMenuChoices();

        do{
            choiceMenu = scanner.nextInt();

            switch (choiceMenu){
                case 0:
                    showSizeOfProducts(products);
                    showMenuChoices();
                    break;
                case 1 :
                    totalWeight(products);
                    showMenuChoices();
                    break;
                case 2:
                    mostExpensive(products);
                    showMenuChoices();
                    break;
                case 3:
                    System.out.println("what do u want to add?");
                    System.out.println("1 -> Book");
                    System.out.println("2 -> Dvd");
                    System.out.println("3 -> Racket");
                    System.out.println("4 -> Exit program");

                    choiceAddProduct = scanner.nextInt();


                    do{

                        if(choiceAddProduct == 1){
                            addProduct(products,book1);
                        }else if(choiceAddProduct == 2){
                            addProduct(products,dvd3);
                        }else if(choiceAddProduct == 3){
                            addProduct(products,racket3);
                        }else if(choiceAddProduct == 4){
                            System.out.println("Program ended..");
                            break;
                        }else{
                            System.out.println("Number selected not valid, try again...");
                            choiceAddProduct = scanner.nextInt();
                        }
                    }while(choiceAddProduct < 1 || choiceAddProduct > 5);

                    showMenuChoices();

                    break;
                case 4:
                    howManyFantasyBooks(products);
                    showMenuChoices();
                    break;
                case 5:
                    dropRackets(products);
                    showMenuChoices();
                    break;
                case 6:
                    System.out.println("Exit....");
                    System.out.println("\r\n"
                            + "  ________                  .______.                 \r\n"
                            + " /  _____/  ____   ____   __| _/\\_ |__ ___.__. ____  \r\n"
                            + "/   \\  ___ /  _ \\ /  _ \\ / __ |  | __ <   |  |/ __ \\ \r\n"
                            + "\\    \\_\\  (  <_> |  <_> ) /_/ |  | \\_\\ \\___  \\  ___/ \r\n"
                            + " \\______  /\\____/ \\____/\\____ |  |___  / ____|\\___  >\r\n"
                            + "        \\/                   \\/      \\/\\/         \\");

                    break;

            }
        }while(choiceMenu != 6);

        scanner.close();




    }

    public  static void showMenuChoices(){

        System.out.println("0 ---> Show how many there are");
        System.out.println("1 ---> Show total weight of the products");
        System.out.println("2 ---> Most expensive product");
        System.out.println("3 ---> Add a new product to the list");
        System.out.println("4 ---> How many Fantasy books there are?");
        System.out.println("5 ---> All the Rackets (Drop Style) over 100 Euros");
        System.out.println("6 ---> Goodbye!\n");
    }

    public static void addProduct(ArrayList<GeneralProduct> gpList,GeneralProduct gp){
        gpList.add(gp);
    }

    public static void showSizeOfProducts(ArrayList<GeneralProduct> gpList){

        System.out.println("The number of the products in the store is: " + gpList.size());
    }


    public static void howManyFantasyBooks(ArrayList<GeneralProduct> gpList){

        int count = 0;

        for(int i = 0; i < gpList.size(); i++){
            if(gpList.get(i) instanceof Book){
                if(((Book) gpList.get(i)).getCategory().equalsIgnoreCase("Fantasy")){
                    count++;
                }
            }
        }
        System.out.println("The fantasy books are %d" + count);
    }


    public static void totalWeight(ArrayList<GeneralProduct> gpList){

        double tW = 0;
        for(GeneralProduct gp : gpList){
            tW += gp.getWeight();
        }
        System.out.println("The total weight of all procuts is %f " + tW);
    }


    public static void mostExpensive(ArrayList<GeneralProduct> gpList){

        double mE = 0;

        for(GeneralProduct gp : gpList){
            if(gp.getPrice() > mE){
                mE = gp.getPrice();
            }
        }
        System.out.println("The most expensive product value is %f " + mE);
    }

    public static ArrayList<GeneralProduct> dropRackets(ArrayList<GeneralProduct> gpList){

        ArrayList<GeneralProduct> dR = new ArrayList<>();

        for (int i = 0; i< gpList.size(); i++){
            if(gpList.get(i) instanceof Racket){
                if(((Racket)gpList.get(i)).getPrice() > 100.00 && ((Racket)gpList.get(i)).getType().equalsIgnoreCase("Drop")){
                    dR.add(gpList.get(i));
                }
            }
        }
        System.out.println("Rackets that cost more than 100 and are type: Drop are % d" + dR.size());
        return dR;
    }
}
