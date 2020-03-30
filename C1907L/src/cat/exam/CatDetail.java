/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.exam;

import cat.color.ColorManager;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CatDetail implements Cat{
    String loai, mau, noiSong;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public CatDetail() {
    }

    public CatDetail(String loai, String mau, String noiSong) {
        this.loai = loai;
        this.mau = mau;
        this.noiSong = noiSong;
    }

    @Override
    public void hienThi() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CatDetail{" + "loai=" + loai + ", mau=" + mau + ", noiSong=" + noiSong + '}';
    }

    @Override
    public void nhap(ColorManager color) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào loài mèo: ");
        this.loai = scanner.nextLine();
        System.out.println("Chọn màu: ");
        this.mau = color.ColorList();
        System.out.println("Nhập nơi sống: ");
        this.noiSong = scanner.nextLine();
    }
    
}
