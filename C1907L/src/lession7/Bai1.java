/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào 2 số thực: ");
        try{
            System.out.print("a = ");
            float a = Float.parseFloat(scanner.nextLine());
            System.out.print("b = ");
            float b = Float.parseFloat(scanner.nextLine());
            System.out.format("%f / %f = %f", a, b, chia(a,b));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static float chia(float a, float b) throws Exception{
        if(a == 0 || b == 0){
            throw new Exception("Phép chia không hợp lệ!");
        }else{
            return a / b;
        }
    }
}
