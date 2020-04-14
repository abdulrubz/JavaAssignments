public class Node<T> {
    T value;
    Node<T> next;

    public Node(T data) {
        this.value = data;
        this.next = null;
    }
}
