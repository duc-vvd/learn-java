
package Homework;
import java.util.Scanner;
// Bai 1: 
public class Employee {
    String hoTen, gioiTinh, queQuan, chucVu;
    double luong;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Employee() {
    }

    public Employee(String hoTen, String gioiTinh, String queQuan, String chucVu, double luong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.chucVu = chucVu;
        this.luong = luong;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen = input.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = input.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = input.nextLine();
        System.out.print("Nhập chức vụ: ");
        chucVu = input.nextLine();
        System.out.print("Nhập lương: ");
        luong = Double.parseDouble(input.nextLine());
    }
    
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" + "hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", queQuan=" + queQuan + ", chucVu=" + chucVu + ", luong=" + luong + '}';
    }
}
