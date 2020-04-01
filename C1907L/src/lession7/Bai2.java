/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Nhập số phần tử cho mảng: ");
        n = Integer.parseInt(scanner.nextLine());
        List<Integer> newArr = new ArrayList<>();
        
        try{
            newArr = nhap(n);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static List<Integer> nhap(int n) throws Exception{
        Scanner scanner = new Scanner(System.in);
        List<Integer> intArr = new ArrayList<>();
        int value;
        int count = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Phần tử thứ " + i + ": ");
            value = Integer.parseInt(scanner.nextLine());
            if(value == 100){
                count++;
                break;
            }else{
                intArr.add(value);
            }
        }
        
        if(count > 0){
            for(int i = 0; i < intArr.size() ; i++){
                throw new Exception("Giá trị nhập vào là 100!\nChương trình kết thúc.\nDanh sách các phần tử đã nhập là:" + show(intArr));
            }
        }else{
            System.out.println("Danh sách các phần tử đã nhập là:" + show(intArr));
        }
        
        return intArr;
        
    }
    
    public static String show(List<Integer> arr){
        String str = "\n";
        for(int i = 0; i < arr.size(); i++){
            str = str + arr.get(i) + "\n";
        }
        return str;
    }
}
