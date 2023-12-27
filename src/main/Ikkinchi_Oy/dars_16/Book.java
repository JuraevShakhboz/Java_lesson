package Ikkinchi_Oy.dars_16;

public class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public static  void addBook(int id, String name, String author, String publisher, int quantity){
        System.out.print("");
    }
}
