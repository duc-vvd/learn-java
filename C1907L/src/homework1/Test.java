
package homework1;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        Computer computer = new Computer();
        House house = new House();
        Mark mark = new Mark("Java", 9.9f);
        Country country = new Country("Viêt Nam", "Châu Á");
        
        car.input();
        computer.input();
        house.input();
        
        car.display();
        computer.display();
        house.display();
        mark.display();
        country.display();
    }    
}
