/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;
import java.util.Scanner;
/**
 *
 * @author DUC
 */
public class People extends IInfor{
    String name, address;
    int age;

    public People() {
    }

    public People(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = input.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhập địa chỉ: ");
        address = input.nextLine();
    }
}
