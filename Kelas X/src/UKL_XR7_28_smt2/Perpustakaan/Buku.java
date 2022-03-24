package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;

public class Buku {
    /* Deklarasi Array list */
    private ArrayList<String> book = new ArrayList<String>();
    private ArrayList<Integer> stock = new ArrayList<Integer>();
    private ArrayList<Integer> price = new ArrayList<Integer>();

    public Buku(){
        this.book.add("Danur");
        this.stock.add(10);
        this.price.add(5000);

        this.book.add("Asih");
        this.stock.add(12);
        this.price.add(5000);

        this.book.add("Menjadi sukse");
        this.stock.add(18);
        this.price.add(5000);
    }

    /* Method */

    /* Acces (elements) */
    public int getStock(){
        return this.book.size();
    }

    public void setBook(String book){
        this.book.add(book);
    }

    public String getBook(int idBook){
        return this.book.get(idBook);
    }

    public void setStock(int stock){
        this.stock.get(stock);
    }
    public int getStock(int idBook){
        return this.stock.get(idBook);
    }

    public void editStock(int idBook, int stock){
        this.stock.set(idBook,stock);
    }

    public void setPrice(int price){
        this.price.add(price);
    }

    public int getprice(int idBook){
        return this.price.get(idBook);
    }



}
