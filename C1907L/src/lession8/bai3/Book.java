/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Book {
    String tenSach, tenTacGia, nhaXuatBan;
    int namSanXuat;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public Book() {
    }

    public Book(String tenSach, String tenTacGia, String nhaXuatBan, int namSanXuat) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namSanXuat = namSanXuat;
    }
    
    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" + "tenSach=" + tenSach + ", tenTacGia=" + tenTacGia + ", nhaXuatBan=" + nhaXuatBan + ", namSanXuat=" + namSanXuat + '}';
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        tenTacGia = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = Integer.parseInt(scanner.nextLine());
    }
}
