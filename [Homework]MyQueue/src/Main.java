/**
 * Created by 130 on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 13; i++){
            queue.add(i*i);
        }
        for (int i = 0; i < 12; i++){
            System.out.println(queue.poll());
        }
    }
}
