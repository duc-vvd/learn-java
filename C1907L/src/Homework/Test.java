
package Homework;

// Bai1
public class Test {
    public static void main(String[] args){
        Employee nv1 = new Employee("Vũ Việt Đức","Nam","Hải Phòng","Học sinh",999999);
        Employee nv2 = new Employee();
        nv2.input();
        nv1.show();
        nv2.show();
    }
}
