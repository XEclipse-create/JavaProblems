import java.util.*;
abstract class Book
{
    abstract void display();
}
class Mybook extends Book
{
    String title;
    String author;
    int price;
    Mybook(String title,String author,int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display()
    {
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}
class DriverMain
{
    public static void main(String args[])
    {
        Scanner inpt = new Scanner(System.in);
        String title = inpt.nextLine();
        String author = inpt.nextLine();
        int price = inpt.nextInt();
        Mybook book1 = new Mybook(title,author,price);
        book1.display();
    }
}