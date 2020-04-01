/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        cTivi tivi;
        System.out.println("Vui lòng chọn cách khởi tạo tivi:\n1. Mặc định\n2. Tự chọn kênh ");
        int ch = Integer.parseInt(scanner.nextLine());
        if(ch == 2){
            System.out.print("Vui lòng nhập số kênh: ");
            int numbers = Integer.parseInt(scanner.nextLine());
            String[] strArr = new String[numbers];
            for(int i = 0; i < numbers; i++){
                System.out.print("Nhập tên kênh thứ " + (i + 1) + " : ");
                strArr[i] = scanner.nextLine();
            }
            tivi = new cTivi(strArr);
        }else{
            tivi = new cTivi();
        }
        
        while(true){
            System.out.println("Vui long chon: 1.    Chuyen trang thai (switch)\n2.    Chuyen trang thai kem theo kenh\n3.    Bat tivi\n4.    Tat tivi\n5.    Chuyen kenh tiep\n6.    Chuyen kenh truoc\n7.    Xem thong tin Tivi\n8.    Ket thuc");
            int choose = Integer.parseInt(scanner.nextLine());
            
            switch(choose){
                case 1:
                    tivi.Switch();
                    break;
                case 2:
                    System.out.print("Vui lòng nhập kênh: ");
                    String k = scanner.nextLine();
                    tivi.Switch(k);
                    break;
                case 3:
                    tivi.On();
                    break;
                case 4:
                    tivi.Off();
                    break;
                case 5:
                    tivi.nextChannel();
                    break;
                case 6:
                    tivi.previousChannel();
                    break;
                case 7:
                    tivi.Show();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Lựa chọn không đúng, vui lòng chọn lại!");
            }
            
            if(choose == 8){
                break;
            }
        }
    }
}
