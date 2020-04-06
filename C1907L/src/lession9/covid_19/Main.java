/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession9.covid_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args){
        List<Citizen> citizenList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        
        do{
            System.out.println("Vui lòng chọn: \n1. Lập danh sách tất cả công dân tại Việt Nam\n2. Tìm kiếm thông tin bệnh nhân theo tên\n3. Tìm kiếm bệnh nhân theo CMTND\n4. Thiết lập tình trạng sức khoẻ\n5. Thiết lập lộ trình di chuyển của 1 bệnh nhân.\n6. Thiết lập trạng thái bệnh nhân đã tiếp xúc vs một bệnh nhân dương tính COVID-19\n7. Hiển thị danh sách bệnh nhân dương tính COVID-19\n8. Hiển thị danh sách bệnh nhân đang theo dõi\n9. Thoát");
            choose = Integer.parseInt(input.nextLine());
            
            switch(choose){
                case 1:
                    System.out.print("Nhập số công dân cần thêm: ");
                    int n = Integer.parseInt(input.nextLine());
                    
                    for(int i = 0; i < n; i++){
                        Citizen c = new Citizen();
                        c.input();
                        
                        citizenList.add(c);
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên bệnh nhân cần tìm: ");
                    String name = input.nextLine();
                    
                    for(Citizen c: citizenList){
                        if(c.getTen().equalsIgnoreCase(name)){
                            c.show();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập CMTND công dân cần tìm: ");
                    String cmt = input.nextLine();
                    
                    for(Citizen c: citizenList){
                        if(c.getCmt().equalsIgnoreCase(cmt)){
                            c.show();
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập CMTND công dân cần thiết lập: ");
                    String cmt2 = input.nextLine();
                    
                    int status = nhapSK();
                    for(Citizen c: citizenList){
                        if(c.getCmt().equalsIgnoreCase(cmt2)){
                            switch(status){
                                case 0:
                                    c.setTrangThai(Citizen.TTSK.BT);
                                    break;
                                case 1:
                                    c.setTrangThai(Citizen.TTSK.TD);
                                    break;
                                case 2:
                                    c.setTrangThai(Citizen.TTSK.DT);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập CMTND công dân cần tìm: ");
                    String cmt3 = input.nextLine();
                    
                    for(Citizen c: citizenList){
                        if(c.getCmt().equalsIgnoreCase(cmt3)){
                            if(c.getTrangThai() ==  Citizen.TTSK.TD || c.getTrangThai() ==  Citizen.TTSK.DT){
                                c.inputLTDT();
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Nhập CMTND công dân cần tìm: ");
                    String cmt4 = input.nextLine();
                    
                    for (Citizen c : citizenList) {
                        if(c.getCmt().equalsIgnoreCase(cmt4)) {
                            if(c.getTrangThai()== Citizen.TTSK.BT || c.getTrangThai()== Citizen.TTSK.DT) {
                                for (Citizen citizen : citizenList) {
                                    if(citizen.getTrangThai()== Citizen.TTSK.BT && c.getLoTrinhDiChuyen().contains(citizen.getDiaChiTamTru())) {
                                        c.setTrangThai(Citizen.TTSK.TD);
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 7:
                    for (Citizen c : citizenList) {
                        if(c.getTrangThai()== Citizen.TTSK.DT) {
                            c.show();
                        }
                    }
                    break;
                case 8:
                    for (Citizen c : citizenList) {
                        if(c.getTrangThai()== Citizen.TTSK.TD) {
                            c.show();
                        }
                    }
                    break;
                case 9:
                    System.out.println("Thoát!!!");
                    break;
                default:
                    System.out.println("Nhập không đúng! Vui lòng chọn lại.");
                    break;
            }
        }while(choose != 9);
    }
    
    public static int nhapSK(){
        Scanner input = new Scanner(System.in);
        int choose;
        
        while(true){
            System.out.println("Nhập tình trạng sức khỏe bệnh nhân: \n0. Bình thường\n1. Cần theo dõi\n2. Dương tính COVID-19");
            choose =  Integer.parseInt(input.nextLine());
            if(choose != 0 || choose != 1 || choose != 2){
                System.out.println("Vui lòng chọn lại!");
            }else{
                break;
            }
        }
        
        return choose;
    }
}
