
package homework1;
import java.util.Scanner;
//Bai 3:
public class Car {
    String name,color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tên: ");
        name = input.nextLine();
        System.out.print("Màu: ");
        color = input.nextLine();
    }
    
    public void display(){
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", color=" + color + '}';
    }
}
