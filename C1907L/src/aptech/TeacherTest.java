package aptech;
import java.util.Scanner;

public class TeacherTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Teacher[] teachers;
        int n;
        
        while(true){
            System.out.println("Vui lòng nhập: \n1: Nhập vào n giảng viên\n2: Hiển thị thông tin tất cả các giảng viên\n3: Hiển thị giảng viên có lương cao nhất\n4: Thoát");
            int chon = Integer.parseInt(input.nextLine());
            switch(chon){
                case 1:
                    System.out.print("Nhập số giảng viên: ");
                    n = Integer.parseInt(input.nextLine());
                    teachers = new Teacher[n];
                    for(int i = 0; i < n; i++){
                        teachers[i].inputInfo();
                    }
                    break;
                case 2:
                    for(int i = 0; i < teachers.length; i++){
                        teachers[i].showInfo();
                    }
                    break;
                case 3:
                    int max = 0;
                    for(int i = 0; i < teachers.length; i++){
                        if(teachers[i].luongThucNhan() > max){
                            max = teachers[i].luongThucNhan();
                        }
                    }
                    System.out.println("Giảng viên có lương cao nhất là: ");
                    for(int i = 0; i < teachers.length; i++){
                        if(teachers[i].luongThucNhan() == max){
                            teachers[i].showInfo();
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bạn nhập không đúng, vui lòng chọn lại\n");
            }
            if(chon == 4){
                break;
            }
        }
    }
}
