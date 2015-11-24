/**
 * Created by Ольга on 24.11.2015.
 */
public class myArray {
    private int[] myArray;

    public myArray(int index){
        myArray = new int[index];
    }
    public myArray(){
        myArray = new int[];
    }

    public myArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int[] addMyArray(int[] Array){
        System.arraycopy(new myArray());

    }

    public int getSize(){
        return myArray.length;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }
}
