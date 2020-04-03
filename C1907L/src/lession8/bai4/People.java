/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai4;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class People {
    String name, address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public People() {
    }

    public People(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public void show() {
        System.out.println("Thông tin: ");
        System.out.println("Tên: " + name);
        System.out.println("Địa chỉ: " + address);
    }
    
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên: ");
        name = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        address = scanner.nextLine();
    }
}
