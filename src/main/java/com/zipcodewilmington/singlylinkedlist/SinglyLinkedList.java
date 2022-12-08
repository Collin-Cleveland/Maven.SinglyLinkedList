package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;
    int size;
    public Node<T> getHead() {return head;}
    public void setHead(Node<T> head) {this.head = head;}
    public Node<T> getTail() {return tail;}
    public void setTail(Node<T> tail) {this.tail = tail;}
    public SinglyLinkedList() {this.head = null;}
    public void add(T data) {
        Node<T> node = new Node<T>(data);

        if (head == null){ head = node;}
        else {
            tail.setNextNode(node);
        }
        this.setTail(node);
        size++;
    }

    public T get(int index){
        int counter = 0;
        Node<T> temp = head;

        while (counter != index){
            temp = temp.getNextNode();
            counter++;
        }
        return temp.getValue();
    }

    public boolean contains(T data){
        int counter = 0;
        Node<T> temp = head;

        while (temp.getValue() != data) {
            temp = temp.getNextNode();
            counter++;
        }
        return temp.getValue().equals(data);
    }
}
