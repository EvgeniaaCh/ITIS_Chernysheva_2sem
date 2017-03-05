/**
 * Created by 130 on 05.03.2017.
 */
public class Queue {
    private int [] array = new int[5];
    private final int k=5;
    private int last = -1;

    public int peek(){
        return array[0];
    }

    public int poll(){
        int j = array[0];
        if (array.length-last == 10){
            int [] array= new int[this.array.length-k];
            for (int i = 1; i < array.length; i++) {
                array[i-1]=this.array[i];
            }
            this.array=array;
        }else {
            for (int i = 1; i < last; i++) {
                array[i - 1] = array[i];
            }
        }
        array[last] = 0;
        last--;
        return j;
    }

    public void add(int element){
        last++;
        if (array.length - 1 != last){
            array[last]=element;
        } else{
            int [] array = new int[this.array.length+k];
            for (int i = 0; i < this.array.length; i++) {
                array[i]=this.array[i];
            }
            array[last]=element;
            this.array = array;
        }

    }
}
