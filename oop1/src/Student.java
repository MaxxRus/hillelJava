/**
 * Created by YKatrechko on 02.07.2015.
 */
public class Student extends Person{
    public int[] marks;
    public Student(){
        super(1);
        System.out.println("student const");
    }

    public void setMarks(int[] marks){
        this.marks = marks;
    }

}