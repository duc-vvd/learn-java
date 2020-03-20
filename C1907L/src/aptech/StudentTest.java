package aptech;
import java.util.Scanner;

public class StudentTest {

  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Student[] students;
       int n;
       
       while(true) {
           System.out.println("Vui lòng chọn: \n1: Nhập vào n sinh viên\n2: Hiển thị thông tin tất cả các sinh viên\n3: Hiển thị sinh viên có điểm trung bình cao nhất và sinh viên có điểm trung bình thấp nhất\n4: Tìm kiếm sinh viên theo mã sinh viên\n5: Hiển thị tất cả các sinh viên theo thứ tự tên trong bảng chữ cái (A->Z)\n6: Hiển thị tất cả các sinh viên được học bổng\n7: Thoát");
           int chon = Integer.parseInt(input.nextLine());
           switch(chon){
               case 1:
                   System.out.print("Nhập số lượng sinh viên: ");
                   n = Integer.parseInt(input.nextLine());
                   students = new Student[n];
                   for(int i = 0; i < n; i++){
                       students[i].inputInfo();
                   }
                   break;
                case 2:
                    System.out.println("Thông tin tất cả sinh viên: ");
                    for(int i = 0; i < students.length; i++){
                       students[i].showInfo();
                   }
                   break;
                case 3:
                    float max = 0;
                    float min = 0;
                    for(int i = 0; i < students.length; i++){
                        if(students[i].getDiemTrungBinh() > max){
                            max = students[i].getDiemTrungBinh();
                        }
                        if(students[i].getDiemTrungBinh() < min){
                            min = students[i].getDiemTrungBinh();
                        }
                    }
                    for(int i = 0; i < students.length; i++){
                        if(students[i].getDiemTrungBinh() == max){
                            System.out.println("Student có điểm cao nhất: ");
                            students[i].showInfo();
                        }
                        if(students[i].getDiemTrungBinh() == min){
                            System.out.println("Student có điểm thấp nhất: ");
                            students[i].showInfo();
                        }
                    }
                   break;
                case 4:
                    System.out.print("Nhập mã sinh viên: ");
                    String msv = input.nextLine();
                    int count = 0;
                    for(int i = 0; i < students.length; i++){
                        if(students[i].getMaSinhVien().equals(msv)){
                            students[i].showInfo();
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("Không có sinh viên nào có mã là: " + msv);
                    }
                   break;
                case 5:
                    System.out.println("Danh sách sinh viên sau khi sắp xếp: ");
                    for(int i = 0; i < students.length - 1 ; i++){
                        for(int y = i + 1; y < student.length; y++){
                            if(students[i].ten.compareTo(students[y].ten) < 0){
                                Student temp = students[i];
                                students[i] = students[y];
                                students[y] = temp;
                            }
                        }
                    }
                    for(int i = 0; i < students.length; i++){
                        students[i].showInfo();
                    }
                   break;
                case 6:
                    for(int i = 0; i < students.length - 1 ; i++){
                        for(int y = i + 1; y < student.length; y++){
                            if(students[i].getDiemTrungBinh() <  students[y].getDiemTrungBinh()){
                                Student temp = students[i];
                                students[i] = students[y];
                                students[y] = temp;
                            }
                        }
                    }
                    System.out.println("Tất cả học sinh, sinh viên được học bổng là: ");
                    for(int i = 0; i < students.length; i++){
                        if(students[i].hocBong()){
                            students[i].showInfo();
                        }
                    }
                   break;
                case 7:
                   break;
                default:
                    System.out.println("Nhập sai, vui lòng chọn lại: \n\n");
           }
           
           if(chon == 7){
               break;
           }
       }
    }
    
}
