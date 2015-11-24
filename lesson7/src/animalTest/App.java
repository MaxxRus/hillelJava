package animalTest;

/**
 * Created by ITHILLEL5 on 24.11.2015.
 */
public class App {
    public static void main(String[] args) {
        Cat murka = new Cat(1,3,2.4,"Grey,","Myrka",true);

        Cat barsik = new Cat(2,5,3.4,"Grey,","Barsik",true);


        Zoo zoo = new Zoo();
        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);


        zoo.interview();
    }
}
