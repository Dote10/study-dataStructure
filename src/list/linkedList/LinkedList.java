package list.linkedList;

import list.ListInterface;
import list.Node;

public class LinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int numItems;

    public LinkedList() {
        this.head = new Node<>(null,null);
        this.numItems = 0;
    }

    @Override
    public void add(int i, E x) {

    }

    @Override
    public void append(E x) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public boolean removeItem(E x) {
        return false;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public void set(int i, E x) {

    }

    @Override
    public int indexOf(E x) {
        return 0;
    }

    @Override
    public int len() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
