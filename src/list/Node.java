package list;

public class Node <T>{
    public T item;
    public Node<T> next;

    public Node(T newItem) {
        this.item = newItem;
        this.next = null;
    }

    public Node(T newItem, Node<T> nextNode) {
        this.item = newItem;
        this.next = nextNode;
    }
}
