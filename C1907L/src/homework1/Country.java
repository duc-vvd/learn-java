/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;
// Bai 5: 
public class Country {
    String name, area;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Country() {
    }

    public Country(String name, String area) {
        this.name = name;
        this.area = area;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tên: ");
        name = input.nextLine();
        System.out.print("Khu vực: ");
        area = input.nextLine();
    }
    
    public void display(){
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", area=" + area + '}';
    }
}
