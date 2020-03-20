package aptech;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AptechBook[] books;
        int n;
        
        while(true){
            System.out.println("Vui lòng chọn: \n1.    Nhập thông tin n cuốn sách của Aptech\n2.    Hiển thị thông tin vừa nhập\n3.    Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị\n4.    Tìm kiếm theo tên sách\n5.    Tìm kiếm theo tên tác giả\n6.    Thoát.");
            int chon = Integer.parseInt(input.nextLine());
            
            switch(chon){
                case 1:
                    System.out.print("Nhập số lượng cuốn sách: ");
                    n = Integer.parseInt(input.nextLine());
                    books = new AptechBook[n];
                    System.out.print("Nhập thông tin cho " + n + " cuốn sách: ");
                    for(int i = 0; i < n; i++){
                        books[i].input();
                    }
                    break;
                case 2:
                    for(int i = 0; i < books.length; i++){
                        books[i].display();
                    }
                    break;
                case 3:
                    for(int i = 0; i < books.length; i++){
                        for(int y = i + 1; y < books.length; y++){
                            if(books[i].getYearPublishing() < books[y].getYearPublishing()){
                                AptechBook temp = books[i];
                                books[i] = books[y];
                                books[y] = temp;
                            }
                        }
                    }
                    System.out.print("Thông tin số sách sau khi đã sắp xếp: ");
                    for(int i = 0; i < books.length; i++){
                        books[i].display();
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên sách: ");
                    int count = 0;
                    String name = input.nextLine();
                    for(int i = 0; i < books.length; i++){
                        if(books[i].getBookName().compareTo(name) == 0){
                            books[i].display();
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("Không có cuốn sách nào có tên là: " + name);
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên tác giả: ");
                    int c = 0;
                    String author = input.nextLine();
                    for(int i = 0; i < books.length; i++){
                        if(books[i].getBookAuthor().compareTo(author) == 0){
                            books[i].display();
                            c++;
                        }
                    }
                    if(c == 0){
                        System.out.println("Không có cuốn sách nào có tác giả là: " + author);
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Bạn đã chọn sai, vui lòng chọn lại.");
            }
            if(chon == 6){
                break;
            }
        }
    }
}
