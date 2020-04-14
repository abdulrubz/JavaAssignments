public class SListIterator<T> {
    private Node<T> head;
    int size = 0;

    public SListIterator() {
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void insert(T value) {

        Node<T> tempNode = head;
        Node<T> newNode = new Node<T>(value);

        if (tempNode == null) {
            head = newNode;
        }
        else {
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        size++;
    }

    public T remove(int position) {

        Node<T> prevNode = null;
        Node<T> tempNode = head;

        if (position > size) {
            System.out.println("Invalid position");
            return null;
        }

        else if (size ==1) {
            head = null;
        }

        else {
            for (int i = 0; i < position - 1; i++) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }
            prevNode.next = tempNode.next;
        }
        size--;
        return tempNode.value;
    }
}