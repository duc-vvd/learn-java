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
public class Citizen {
    String ten, cmt, gioiTinh, diaChiThuongTru, diaChiTamTru;
    int tuoi;
    List<String> loTrinhDiChuyen;
    static enum TTSK{BT,TD,DT};
    TTSK trangThai;

    public Citizen() {
    }

    public Citizen(String ten, String cmt, String gioiTinh, String diaChiThuongTru, String diaChiTamTru, int tuoi) {
        this.ten = ten;
        this.cmt = cmt;
        this.gioiTinh = gioiTinh;
        this.diaChiThuongTru = diaChiThuongTru;
        this.diaChiTamTru = diaChiTamTru;
        this.tuoi = tuoi;
        loTrinhDiChuyen = new ArrayList<>();
        trangThai = TTSK.BT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChiThuongTru() {
        return diaChiThuongTru;
    }

    public void setDiaChiThuongTru(String diaChiThuongTru) {
        this.diaChiThuongTru = diaChiThuongTru;
    }

    public String getDiaChiTamTru() {
        return diaChiTamTru;
    }

    public void setDiaChiTamTru(String diaChiTamTru) {
        this.diaChiTamTru = diaChiTamTru;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public List<String> getLoTrinhDiChuyen() {
        return loTrinhDiChuyen;
    }

    public void setLoTrinhDiChuyen(List<String> loTrinhDiChuyen) {
        this.loTrinhDiChuyen = loTrinhDiChuyen;
    }

    public TTSK getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TTSK trangThai) {
        this.trangThai = trangThai;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = input.nextLine();
        System.out.println("Nhập CMTND: ");
        cmt = input.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = input.nextLine();
        System.out.println("Nhập địa chỉ thường trú: ");
        diaChiThuongTru = input.nextLine();
        System.out.println("Nhập địa chỉ tạm trú: ");
        diaChiTamTru = input.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = Integer.parseInt(input.nextLine());
    }
    
    public void show(){
        System.out.format("\n Tên: %s \nTuổi: %d \nCMTND: %s \nGiói Tính: %s \nĐịa chỉ: %s \nĐịa chỉ tạm trú: %s \n", ten, tuoi, cmt, gioiTinh, diaChiThuongTru, diaChiTamTru);
        switch(trangThai){
            case BT:
                System.out.println("Công dân có sức khỏe bình thường");
                break;
            case TD:
                System.out.println("Công dân đang được theo dõi");
                break;
            case DT:
                System.out.println("Công dân dương tính với COVID-19");
        }
        if(loTrinhDiChuyen.size() > 0){
            System.out.println("Lộ trình di chuyển của bệnh nhân: ");
            for(String item: loTrinhDiChuyen){
                System.out.println(item);
            }
        }
    }
    
    public void inputLTDT(){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("Nhập địa chỉ di chuyển mới: ");
            String newAddress = input.nextLine();
            int tmp = 1;
            if(!loTrinhDiChuyen.contains(newAddress)) {
                loTrinhDiChuyen.add(newAddress);
            }
            while(true){
                System.out.println("Vui lòng chọn:\n 1. Tiếp tục\n 2.Thoát");
                int choose = Integer.parseInt(input.nextLine());
                if(choose == 1){
                    break;
                }else if(choose == 2){
                    tmp = 2;
                    break;
                }else{
                    System.out.println("Bạn chọn không đúng! Vui lòng chọn lại!");
                }
            }
            if(tmp == 2){
                break;
            }
        }
    }
}
