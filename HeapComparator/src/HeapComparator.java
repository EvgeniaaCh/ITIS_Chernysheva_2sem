import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeapComparator<T extends Comparable<T>> {
    private List<T> data;
    private int heapSize;
    private Comparator<T> comparator;

    public HeapComparator() {
        data = new ArrayList<>();
    }

    public HeapComparator(Comparator<T> comparator) {
        this();
        this.comparator = comparator;
    }

    public void sort() {
        heapMake(data);
        while (heapSize > 1) {
            swap(0, heapSize - 1);
            heapSize--;
            heapify(data, 0);
        }
    }

    private void heapMake(List<T> a) {
        heapSize = a.size();
        for (int i = a.size() / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    private void heapify(List<T> a, int i) {
        int left = left(i);
        int right = right(i);

        int min = i;
        if (left < heapSize && compare(a.get(i), a.get(left)) < 0) {
            min = left;
        }
        if (right < heapSize && compare(a.get(min), a.get(right)) < 0) {
            min = right;
        }
        if (i != min) {
            swap(i, min);
            heapify(a, min);
        }
    }

    private int compare(T a, T b) {
        if (comparator == null) {
            return a.compareTo(b);
        }

        return comparator.compare(a, b);
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    public void add(T t) {
        data.add(t);
        pushTop(size() - 1);
    }

    public void pushTop(int index) {
        int parent = (index - 1) / 2;
        if (index == 0) {
            return;
        }
        if (compare(data.get(parent), data.get(index)) < 0) {
            swap(index, parent);
            pushTop(parent);
        }
    }


    public void swap(int a, int b) {
        T temp = (T) data.get(a);

        data.set(a, data.get(b));
        data.set(b, temp);
    }

    public int size() {
        return data.size();
    }

    public List<T> getData() {
        return data;
    }
}