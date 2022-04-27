package UKL_XR7_28_smt2.Perpustakaan;

import java.util.ArrayList;

public class Buku {

    /* Deklarasi Array list */
    private ArrayList<String> book = new ArrayList<String>();
    private ArrayList<Integer> stock = new ArrayList<Integer>();
    private ArrayList<Integer> price = new ArrayList<Integer>();

    /* Constructor */
    public Buku(){
        addBook("BarangDefault",0,0);
        addBook("Danur",10,15000);
        addBook("Asih",12,25000);
        addBook("Bella",18,2000);
    }

    /* Method addBook */
    public void addBook(String book, int stock, int price){
        setBook(book);
        setStock(stock);
        setPrice(price);

    }

    /* Method Setter */
    /* changes field value */
    public void setBook(String book){
        this.book.add(book);
    }
    public void setStock(int stock){
        this.stock.add(stock);
    }
    public void setPrice(int price){
        this.price.add(price);
    }
    public void editStock(int idBook, int stock){
        this.stock.set(idBook,stock);
    }

    /* Method Getter */
    /* take field value */
    public String getBook(int idBook){
        return this.book.get(idBook);
    }
    public int getStock(int idBook){
        return this.stock.get(idBook);
    }
    public int getprice(int idBook){
        return this.price.get(idBook);
    }
    public int getStock(){
        return this.book.size();
    }
}
