package animalTest;

/**
 * Created by ITHILLEL5 on 24.11.2015.
 */
public abstract class Cat extends Domestik{
    public Cat(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }


    public void printVoice() {
        System.out.println(getVoice());
    }
}
