import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class SplayTreeIterator<T> implements Iterator<T> {

    private final Stack<BinaryNode> nodes;
    static BinaryNode root;
    public SplayTreeIterator() {
        nodes = new Stack<BinaryNode>();
        pushLeft(root);
    }

    public boolean hasNext() {
        return !nodes.isEmpty();
    }

    public T next() {
        BinaryNode node = nodes.pop();
        if(node != null) {
            pushLeft(node.right);
            return (T) node.key;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    private void pushLeft(BinaryNode node) {
        while (node != null) {
            nodes.push(node);
            node = node.left;
        }
    }

}

