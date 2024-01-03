package list;

public class BestPrecticesNode<T> {
    private T item;
    private BestPrecticesNode next;

    public BestPrecticesNode(T newItem) {
        this.item = newItem;
    }

    public BestPrecticesNode(T newItem, BestPrecticesNode nextNode) {
        this.item = newItem;
        this.next = nextNode;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T newItem) {
        this.item = newItem;
    }

    public BestPrecticesNode getNext() {
        return next;
    }

    public void setNext(BestPrecticesNode nextNode) {
        this.next = nextNode;
    }
}
