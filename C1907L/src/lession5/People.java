///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package lession5;
//import java.util.Scanner;
///**
// *
// * @author ADMIN
// */
//public class People implements IInfor{
//    String name, address;
//    int age;
//
//    public People() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public void showInfor() {
//        System.out.println(toString());
//    }
//
//    @Override
//    public String toString() {
//        return "People{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
//    }
//    
//    public void input(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Tên: ");
//        name = input.nextLine();
//        System.out.print("Tuổi: ");
//        age = Integer.parseInt(input.nextLine());
//        System.out.print("Địa chỉ: ");
//        address = input.nextLine();
//    }
//}
