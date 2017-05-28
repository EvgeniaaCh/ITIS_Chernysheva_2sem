class BinaryNode<T> {

    public final T key;          // The data in the node
    public BinaryNode left;         // Left child
    public BinaryNode right;        // Right child

    public BinaryNode(T theKey) {
        key = theKey;
        left = right = null;
    }
}