import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;


public class SplayTree<T extends Comparable<T>> implements Iterable<T> {

    private BinaryNode root;
    private final BinaryNode aux;

    public SplayTree() {
        root = null;
        aux = new BinaryNode(null);
    }

    public static <T extends Comparable<T>> SplayTree<T> create() {
        return new SplayTree<T>();
    }

    public static <T extends Comparable<T>> SplayTree<T> create(T... elements) {
        SplayTree<T> tree = new SplayTree<T>();
        for (T element : elements) {
            tree.insert(element);
        }
        return tree;
    }

    public boolean insert(T element) {
        if (root == null) {
            root = new BinaryNode(element);
            return true;
        }
        splay(element);

        final int c = element.compareTo((T) root.key);
        if (c == 0) {
            return false;
        }

        BinaryNode n = new BinaryNode(element);
        if (c < 0) {
            n.left = root.left;
            n.right = root;
            root.left = null;
        } else {
            n.right = root.right;
            n.left = root;
            root.right = null;
        }
        root = n;
        return true;
    }

    public boolean remove(T element) {
        splay(element);

        if (element.compareTo((T) root.key) != 0) {
            return false;
        }

        // Now delete the root
        if (root.left == null) {
            root = root.right;
        } else {
            BinaryNode x = root.right;
            root = root.left;
            splay(element);
            root.right = x;
        }
        return true;
    }

    public T findMin() {
        BinaryNode x = root;
        if (root == null) return null;
        while (x.left != null) x = x.left;
        splay((T) x.key);
        return (T) x.key;
    }

    public T findMax() {
        BinaryNode x = root;
        if (root == null) return null;
        while (x.right != null) x = x.right;
        splay((T) x.key);
        return (T) x.key;
    }

    public T find(T element) {
        if (root == null) return null;
        splay(element);
        if (root.key.compareTo(element) != 0) return null;
        return (T) root.key;
    }

    public boolean contains(T element) {
        return find(element) != null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Iterator<T> iterator() {
        return new SplayTreeIterator();
    }

    private void splay(T element) {
        BinaryNode l, r, t, y;
        l = r = aux;
        t = root;
        aux.left = aux.right = null;
        while (true) {
            final int comp = element.compareTo((T) t.key);
            if (comp < 0) {
                if (t.left == null) break;
                if (element.compareTo((T) t.left.key) < 0) {
                    y = t.left;                            /* rotate right */
                    t.left = y.right;
                    y.right = t;
                    t = y;
                    if (t.left == null) break;
                }
                r.left = t;                                 /* link right */
                r = t;
                t = t.left;
            } else if (comp > 0) {
                if (t.right == null) break;
                if (element.compareTo((T) t.right.key) > 0) {
                    y = t.right;                            /* rotate left */
                    t.right = y.left;
                    y.left = t;
                    t = y;
                    if (t.right == null) break;
                }
                l.right = t;                                /* link left */
                l = t;
                t = t.right;
            } else {
                break;
            }
        }
        l.right = t.left;                                   /* assemble */
        r.left = t.right;
        t.left = aux.right;
        t.right = aux.left;
        root = t;
    }
}



