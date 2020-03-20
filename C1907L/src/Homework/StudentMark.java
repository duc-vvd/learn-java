
package Homework;
import java.util.Scanner;
// Bai 2:
public class StudentMark {
    String Rollnumber, fullName, className, subject;
    float scores;

    public String getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(String Rollnumber) {
        this.Rollnumber = Rollnumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getScores() {
        return scores;
    }

    public void setScores(float scores) {
        this.scores = scores;
    }
    
    public StudentMark() {
    }

    public StudentMark(String Rollnumber, String fullName, String className, String subject, float scores) {
        this.Rollnumber = Rollnumber;
        this.fullName = fullName;
        this.className = className;
        this.subject = subject;
        this.scores = scores;
    }
    
    public void show(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "StudentMark{" + "Rollnumber=" + Rollnumber + ", fullName=" + fullName + ", className=" + className + ", subject=" + subject + ", scores=" + scores + '}';
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Rollnumber: ");
        Rollnumber = input.nextLine();
        System.out.print("Nhập họ và tên: ");
        fullName = input.nextLine();
        System.out.print("Nhập tên lớp: ");
        className = input.nextLine();
        System.out.print("Nhập tên môn: ");
        subject = input.nextLine();
        System.out.print("Nhập điểm: ");
        scores = Float.parseFloat(input.nextLine());
    }
    public static void main(String[] args){
        StudentMark std1 = new StudentMark("xxx","Vũ Việt Đức","C1907L","Java", 9.9f);
        StudentMark std2 = new StudentMark();
        std2.input();
        std1.show();
        std2.show();
        if(std1.getScores() > std2.getScores()){
            System.out.println("Học sinh có điểm cao nhất là: ");
            std1.show();
        }
        else{
            System.out.println("Học sinh có điểm cao nhất là: ");
            std2.show();
        }
    }

    
}
