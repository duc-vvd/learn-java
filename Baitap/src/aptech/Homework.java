package aptech;
import java.util.Scanner;

class NhaXuatBan {
    public String tenNhaXuatBan;
    public int ngayThanhLap;
    public String tenNguoiDaiDien;
    public int namThanhLap;

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getNgayThanhLap() {
        return ngayThanhLap;
    }

    public void setNgayThanhLap(int ngayThanhLap) {
        this.ngayThanhLap = ngayThanhLap;
    }

    public String getTenNguoiDaiDien() {
        return tenNguoiDaiDien;
    }

    public void setTenNguoiDaiDien(String tenNguoiDaiDien) {
        this.tenNguoiDaiDien = tenNguoiDaiDien;
    }

    public int getNamThanhLap() {
        return namThanhLap;
    }

    public void setNamThanhLap(int namThanhLap) {
        this.namThanhLap = namThanhLap;
    }

    public NhaXuatBan() {
    }

    public NhaXuatBan(String tenNhaXuatBan, int ngayThanhLap, String tenNguoiDaiDien, int namThanhLap) {
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.ngayThanhLap = ngayThanhLap;
        this.tenNguoiDaiDien = tenNguoiDaiDien;
        this.namThanhLap = namThanhLap;
    }
    
}

class TacGia {
    public String tenTacGia;
    public String butDanh;
    public String ngaySinh;

    public TacGia(String tenTacGia, String butDanh, String ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.butDanh = butDanh;
        this.ngaySinh = ngaySinh;
    }

    public TacGia() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getButDanh() {
        return butDanh;
    }

    public void setButDanh(String butDanh) {
        this.butDanh = butDanh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}

class Sach {
    public String butDanhTacGia;
    public String nhaXuatBan;
    public String tenSach;
    public String theLoai;

    public Sach(String butDanhTacGia, String nhaXuatBan, String tenSach, String theLoai) {
        this.butDanhTacGia = butDanhTacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
    }

    public Sach() {
    }

    public String getButDanhTacGia() {
        return butDanhTacGia;
    }

    public void setButDanhTacGia(String butDanhTacGia) {
        this.butDanhTacGia = butDanhTacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
}

public class Homework {
    public static void main(String[] args) {
        NhaXuatBan nxb = new NhaXuatBan();
        TacGia tg = new TacGia();
        Sach sach = new Sach();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhập thông tin cho sách: ");
        System.out.print("Bút danh tác giả: ");
        sach.setButDanhTacGia(input.nextLine());
        System.out.print("Nhà xuất bản: ");
        sach.setNhaXuatBan(input.nextLine());
        System.out.print("Thể loại: ");
        sach.setTheLoai(input.nextLine());
        System.out.print("Tên sách: ");
        sach.setTenSach(input.nextLine());
        
        System.out.println("Nhập thông tin cho tác giẩ: ");
        System.out.print("Tên tác giả: ");
        tg.setTenTacGia(input.nextLine());
        System.out.print("Bút danh tác giả: ");
        tg.setButDanh(input.nextLine());
        System.out.print("Ngày sinh: ");
        tg.setNgaySinh(input.nextLine());
        
        System.out.println("Nhập thông tin cho nhà sản xuất: ");
        System.out.print("Tên nhà xuất bản: ");
        nxb.setTenNhaXuatBan(input.nextLine());
        System.out.print("Tên người đại diện: ");
        nxb.setTenNguoiDaiDien(input.nextLine());
        System.out.print("Ngày thành lập: ");
        nxb.setNgayThanhLap(Integer.parseInt(input.nextLine()));
        System.out.print("Năm thành lập: ");
        nxb.setNamThanhLap(Integer.parseInt(input.nextLine()));
        
        System.out.println("\n\nThông tin sách: \n Bút danh tác giả: " + sach.getButDanhTacGia() + "\n Nhà xuất bản: " + sach.getNhaXuatBan() + "\n Thể loại: " + sach.getTheLoai() + "\n Tên sách: " + sach.getTenSach());
        System.out.println("\n Thông tin tác giả: \n Tên tác giả: " + tg.getTenTacGia() + "\n Bút danh tác giả: " + tg.getButDanh() + "\n Ngày sinh: " + tg.getNgaySinh());
        System.out.print("\n Thông tin nhà xuất bản: \n Tên nhà xuất bản: " + nxb.getTenNhaXuatBan() + "\n Tên người đại diện: " + nxb.getTenNguoiDaiDien() + "\n Ngày thành lập: " + nxb.getNgayThanhLap() + "\n Năm thành lập: " + nxb.getNamThanhLap());
    }
}