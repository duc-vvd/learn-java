/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;
import java.util.ArrayList;
/**
 *
 * @author DUC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<IInfor> list = new ArrayList<>();
        People people = new People();
        people.input();
        Car car = new Car();
        car.input();
        list.add(people);
        list.add(car);
        showInfor(list);
        
    }
    
    public static void showInfor(ArrayList<IInfor> a){
        for(int i = 0; i < a.size(); i++){
            a.get(i).showInfor();
        }
    }
}
