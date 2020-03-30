/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;
import cat.color.ColorManager;
import cat.manager.ManagerCat;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class UsingManagerCat {
    public static void main(String[] args) {
        ManagerCat managerCat = new ManagerCat();
        Scanner scan = new Scanner(System.in);
        ColorManager colorList = new ColorManager();
        int choose;
        do {
            System.out.print("Nhập vào lựa chọn: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 0:
                    colorList.input();
                    break;
                case 1:
                    managerCat.input(colorList);
                    break;
                case 2:
                    managerCat.output();
                    break;
                case 3:
                    managerCat.sort();
                    for (int i = 0; i < managerCat.catList.size(); i++) {
                        managerCat.catList.get(i).hienThi();
                    }
                    break;
                case 4:
                    managerCat.seach();
                    break;
                case 5:
                    colorList.sort();
                    break;
                case 6:
                    System.out.println("Thoát.");
                    break;
                default:
                    System.err.println("Nhập sai !!!");
                    break;
            }
        } while (choose != 6);
    }

    public static void showMenu() {
        System.out.println("0.Nhập danh sách mã màu");
        System.out.println("1.Nhập thông tin của n con mèo");
        System.out.println("2.Hiển thị thông tin");
        System.out.println("3.Sắp xếp danh sách theo mau");
        System.out.println("4.Tìm kiếm thông tin theo loai");
        System.out.println("5.Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("6.Thoát.");
    }
}
