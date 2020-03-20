package aptech;
import java.util.Scanner;

public class Student extends Person {
    private String maSinhVien, email;
    private float diemTrungBinh;

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        if(maSinhVien.length() != 8){
            System.out.println("Mã sinh viên chứa 8 ký tự.");
        }
        else{
            this.maSinhVien = maSinhVien;  
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.indexOf("@") == -1){
            System.out.println("Email phải có kí tự @.");
        }else{
            int count = 0;
            for(int i = 0; i < email.length(); i++){
                char kyTu = email.charAt(i);
                if(Character.isSpace(kyTu)){
                    count++;
                }
            }
            if(count > 0){
                System.out.println("Email không được chứa khoảng trắng.");
            }else{
                this.email = email;
            }
        }
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        if(diemTrungBinh < 0 || diemTrungBinh > 10){
            System.out.println("Điểm trung bình từ 0.0 - 10.0");
        }else{
            this.diemTrungBinh = diemTrungBinh;
        }
    }

    public Student() {
    }

    public Student(String maSinhVien, String email, float diemTrungBinh, String ten, String gioiTinh, String ngaySinh, String diaChi) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        super.inputInfo();
        System.out.print("Mã sinh viên: ");
        maSinhVien = input.nextLine();
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Điểm trung bình: ");
        diemTrungBinh = Float.parseFloat(input.nextLine());
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("- Mã sinh viên: " + maSinhVien + "\n- Điểm trung bình: " + diemTrungBinh + "\n- Email: " + email);
    } 
    
    public boolean hocBong(){
        if(diemTrungBinh >= 8){
            return true;
        }
        else{
            return false;
        }
    }
}
