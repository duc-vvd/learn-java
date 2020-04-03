/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession8.bai1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Nhập N = ");
        int N = Integer.parseInt(scanner.nextLine());
        
        for(int i = 0; i <= N; i++){
            sum += i;
        }
        
        System.out.format("Tổng các số nguyên từ 0 đến %d là : %d", N, sum);
    }
}
