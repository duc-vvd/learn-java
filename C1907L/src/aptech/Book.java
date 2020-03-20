package aptech;
import java.util.Scanner;

public class Book {
    private String bookName;

    private String bookAuthor;

    private String producer;

    private int yearPublishing;

    private float price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }
    
    public  void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        bookName = nhap.nextLine();
        System.out.print("Nhập tên tác giả: ");
        bookAuthor = nhap.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        producer = nhap.nextLine();
        System.out.print("Nhập năm xuất bản : ");
        yearPublishing = Integer.parseInt(nhap.nextLine());
        System.out.print("Nhập giá: ");
        price = Float.parseFloat(nhap.nextLine());
    }
    
    public void display(){
        System.out.println("- Tên sách: " + bookName + "\n- Tác giả: " + bookAuthor + "\n- Nhà xuất bản: " + producer + "\n- Năm xuất bản: " + yearPublishing + "\n- Giá: " + price);
    }
}
