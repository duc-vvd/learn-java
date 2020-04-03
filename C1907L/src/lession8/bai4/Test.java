/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai4;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args){
        People p = new People();
        Student std = new Student();
        
        System.out.println("Nhập thông tin cho people: ");
        p.input();
        
        System.out.println("Nhập thông tin cho student: ");
        std.input();
        
        p.show();
        std.show();
    }
}
