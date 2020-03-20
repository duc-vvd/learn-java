package aptech;
import java.util.Scanner;

public class Teacher extends Person{
    private String lopDay;
    private int luong,soGioDay;

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public Teacher() {
    }

    public Teacher(String lopDay, int luong, int soGioDay, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.lopDay = lopDay;
        this.luong = luong;
        this.soGioDay = soGioDay;
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("- Lớp dạy: " + lopDay + "\n- Số tiền một giờ dạy: " + luong + "\n- Số giờ dạy: " + soGioDay);
    }

    @Override
    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        super.inputInfo(); 
        System.out.print("Nhập lớp dạy: ");
        lopDay = input.nextLine();
        System.out.print("Nhập số tiền lương một giờ dạy: ");
        luong = Integer.parseInt(input.nextLine());
        System.out.print("Nhập số giờ dạy: ");
        soGioDay = Integer.parseInt(input.nextLine());
    }
    
    public int luongThucNhan(){
        return (luong * soGioDay);
    }
}
