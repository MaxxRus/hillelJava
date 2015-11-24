package animalTest;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ITHILLEL5 on 24.11.2015.
 */
public class Zoo {
    private List animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void interview() {
        for (Animal animal : animals) {
            System.out.println(animal.getVoice());
        }
    }

    public String getVois(){
        String result  = super.();
        result +="my name is ";
        result += getVois();
        return result;
    }
}
