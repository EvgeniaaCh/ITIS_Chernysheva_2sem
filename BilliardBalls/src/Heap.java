import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> list;

    public Heap() {
        list = new ArrayList<>();
    }

    public void add(int value) {
        list.add(value);
        pushTop(size() - 1);
    }

    public void pushTop(int value) {
        int parent = (value - 1) / 2;
        if (value == 0) {
            return;
        }
        if (list.get(value) < list.get(parent)) {
            swap(value, parent);
            pushTop(parent);
        }
    }

    public void swap(int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public int min() {
        return list.get(0);
    }

    public int size() {
        return list.size();
    }
}