/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai3;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book("Sách hay", "Không biết", "Không biết", 1999);
        
        System.out.println("Nhập thông tin cho sách: ");
        book1.input();
        
        System.out.println("Thông tin sách: ");
        book1.show();
        book2.show();
    }
}
