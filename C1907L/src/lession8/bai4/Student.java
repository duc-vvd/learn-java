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
public class Student extends People{
    String rollNo;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
    }

    public Student(String rollNo, String name, String address) {
        super(name, address);
        this.rollNo = rollNo;
    }

    @Override
    public void input() {
        super.input(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập rollNo: ");
        rollNo = scanner.nextLine();
    }

    @Override
    public void show() {
        super.show(); 
        System.out.println("rollNo: " + rollNo);
    }

    

    
}
