package aptech;
import java.util.Scanner;

public class AptechBook extends Book {
    private String language;
    private int semester;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public AptechBook() {
    }

    public AptechBook(String language, int semester, String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("- Ngôn ngữ: " + language + "- Học kỳ: " + semester);
    }

    @Override
    public void input() {
        super.input();
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập tên ngôn ngữ: ");
        language = nhap.nextLine();
        System.out.print("Nhập học kỳ: ");
        semester = Integer.parseInt(nhap.nextLine());
    }
    
}
