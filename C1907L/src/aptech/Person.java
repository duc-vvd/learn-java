package aptech;
import java.util.Scanner;

public class Person {
    String ten, gioiTinh, ngaySinh, diaChi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Person() {
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vui lòng nhập: ");
        System.out.print("Tên: ");
        ten = input.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Giới tính: ");
        gioiTinh = input.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = input.nextLine();
    }
    
    public void showInfo(){
        System.out.println("Thông tin sinh viên: \n- Tên: " + ten + "\n- Giới tính: " + gioiTinh + "\n- Ngày sinh: " + ngaySinh + "\n- Địa chỉ: " + diaChi);
    }
}
