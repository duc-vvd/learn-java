/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String sourceStr, searchingStr;
        int count = 0;
        int lastCount = 0;
        int indexStr = 0;
        List<Integer> countArr = new ArrayList<>();

        System.out.print("Nhập chuỗi: ");
        sourceStr = scanner.nextLine();
        
        System.out.print("Nhập chuỗi tìm kiếm: ");
        searchingStr = scanner.nextLine();
        
        do{
            lastCount++;
            if(sourceStr.indexOf(searchingStr, indexStr) != -1){
                count++;
                indexStr = sourceStr.indexOf(searchingStr, indexStr);
                countArr.add(indexStr);
                indexStr++;
            }
        }while(count == lastCount);
        
        System.out.println("=======================================================");
        
        if(count > 0){
            System.out.println("Số lần chuỗi xuất hiện là: " + count);
            for(int i = 0; i < countArr.size(); i++){
                System.out.format("\nVị trí xuất hiện lần %d là: %d", i + 1, countArr.get(i));
            }
        }else{
            System.out.println("Chuỗi searchingStr không xuất hiện lần nào trong trong chuỗi sourceStr");
        }
    }
}
