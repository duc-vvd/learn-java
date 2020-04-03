/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhâp số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] intArr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Nhập phần tử [" + i + "]: ");
            intArr[i] = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.println("Các phần tử chia hết cho 2 là: ");
        for(int i = 0; i < n; i++){
            if(intArr[i] % 2 == 0){
                System.out.println(intArr[i]);
            }
        }
    }
}
