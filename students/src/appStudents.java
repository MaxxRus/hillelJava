/**
 * Created by Ольга on 24.11.2015.
 */
public class appStudents {
    public static void main(String[] args) {
        Students st1 = new Students("Ivan","Ivanov");
        Students st2 = new Students("Pety","Petrov");
        System.out.println(st1.getFullName());
        System.out.println(st2.getSurname());

    }
}
