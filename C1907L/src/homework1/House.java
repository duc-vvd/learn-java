
package homework1;
import java.util.Scanner;
// Bai 2:
public class House {
    String diaChi, ten;

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public House() {
    }

    public House(String diaChi, String ten) {
        this.diaChi = diaChi;
        this.ten = ten;
    }
    
    public void display(){
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "House{" + "diaChi=" + diaChi + ", ten=" + ten + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tên: ");
        ten = input.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = input.nextLine();
    }
    
}
