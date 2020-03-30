
package Homework;
import java.util.Scanner;
import java.util.ArrayList;
// Bai 3:
public class Product {
    String maHH, tenHH;
    float soLuong, gia1SP;

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }
    
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", gia1SP=" + gia1SP + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Mã hàng hóa: ");
        maHH = input.nextLine();
        System.out.print("Tên hàng hóa: ");
        tenHH = input.nextLine();
        System.out.print("Số lượng hàng hóa: ");
        soLuong = Float.parseFloat(input.nextLine());
        System.out.print("Giá sản phẩm: ");
        gia1SP = Float.parseFloat(input.nextLine());
    }
    
    public static void main(String[] args){
        ArrayList<Product> listProduct = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập số lượng hàng hóa: ");
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            Product product = new Product();
            product.input();
            listProduct.add(product);
        }
        
        float max = 0;
        for(Product p: listProduct){
            if(p.getGia1SP() > max){
                max = p.getGia1SP();
            }
        }
        System.out.println("Sản phẩm có giá cao nhất: ");
        for(Product p: listProduct){
            if(p.getGia1SP() == max){
                p.display();
            }
        }
    }
}
