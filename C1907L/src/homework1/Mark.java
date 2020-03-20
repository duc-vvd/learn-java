
package homework1;
import java.util.Scanner;
// Bai 4:
public class Mark {
    String subject;
    float scores;

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

    public Mark(String subject, float scores) {
        this.subject = subject;
        this.scores = scores;
    }

    public Mark() {
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Môn: ");
        subject = input.nextLine();
        System.out.print("Điểm: ");
        scores = Float.parseFloat(input.nextLine());
    }
    
    public void display(){
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "Mark{" + "subject=" + subject + ", scores=" + scores + '}';
    }

}
