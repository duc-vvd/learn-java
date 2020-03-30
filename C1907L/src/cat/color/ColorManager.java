/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.color;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class ColorManager {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> colorList = new ArrayList<>();

    public void input() {

        System.out.println("Nhập số màu cần thêm : ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập màu : ");
            String color = scan.nextLine();

            colorList.add(color);
        }
    }

    public String ColorList() {
        String mau;
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(i + "Màu " + colorList.get(i));
        }
        int index = Integer.parseInt(scan.nextLine());

        mau = colorList.get(index);

        return mau;
    }
    
    public void sort(){
        for(int i = 0; i < colorList.size(); i++){
            for(int y= i + 1; y < colorList.size(); y++){
                if (colorList.get(i).compareTo(colorList.get(y)) > 0) {
                    String temp = colorList.get(i);
                    colorList.set(i, colorList.get(y));
                    colorList.set(y, temp);
                }
            }
        }
    }

    public ArrayList<String> getColorList() {
        return colorList;
    }
}
