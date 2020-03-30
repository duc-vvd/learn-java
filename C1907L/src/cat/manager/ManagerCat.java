/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.manager;
import cat.color.ColorManager;
import cat.exam.CatDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ManagerCat {
    ArrayList<CatDetail> catList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void input(ColorManager color) {

        System.out.println("Nhập vào số mèo: ");
        int c = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < c; i++) {
            System.out.println("Nhập thông tin mèo thứ: " + (i + 1));
            CatDetail catDetail = new CatDetail();
            catDetail.nhap(color);
            catList.add(catDetail);
        }
    }

    public void output() {
        for (int i = 0; i < catList.size(); i++) {
            catList.get(i).hienThi();
        }
    }

    public void sort() {
        for (int i = 0; i < catList.size(); i++) {
            for (int y = 0; y < catList.size(); y++) {
                if (catList.get(i).getMau().compareTo(catList.get(y).getMau()) > 0) {
                    CatDetail temp = catList.get(i);
                    catList.set(i, catList.get(y));
                    catList.set(y, temp);

                }
            }
        }
    }

    public void seach() {
        System.out.println("Nhập loài mèo muốn tìm kiếm: ");
        String loai = scan.nextLine();
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).getLoai().equalsIgnoreCase(loai)) {
                catList.get(i).hienThi();
            }
        }
    }
}
