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
    public void add(T element) {
        Node<T> node = new Node<T>(element);

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

    public boolean contains(T element){
        int counter = 0;
        Node<T> temp = head;

        while (temp != null) {
            if (temp.getValue().equals(element)){return true;}
            else {temp = temp.getNextNode();
                counter++;}
        }
        return false;
    }

    public int find(T element){
        int counter = 0;
        Node<T> temp = head;

        while (temp != null) {
            if (temp.getValue().equals(element)) {return counter;}
            else {temp = temp.getNextNode();
                counter++;}
        }
        return -1;
    }

    public int size(){
        int counter = 0;
        Node<T> temp = head;

        while (temp != null){
            temp = temp.getNextNode();
            counter++;
        }
        return counter;
    }

    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> copiedList = new SinglyLinkedList<>();
        Node<T> temp = head;

        while (temp != null){
            copiedList.add(temp.getValue());
            temp = temp.getNextNode();
        }
        return copiedList;
    }

    public boolean equals(SinglyLinkedList<T> listToCompare){
        Node<T> temp1 = head;
        Node<T> temp2 = listToCompare.getHead();

        if (this.size() != listToCompare.size()){return false;}
        else{
            while (temp1 != null){
                if (!temp1.getValue().equals(temp2.getValue())) {return false;}
                temp1 = temp1.getNextNode();
                temp2 = temp2.getNextNode();
            }
            return true;
        }
    }

    public void remove(int index) {

        if (index == 0) {
            this.setHead(head.getNextNode());
        } else {
            int counter = 0;
            Node<T> temp = head;
            while (counter != index - 1) {
                temp = temp.getNextNode();
                counter++;
            }
            if (temp.getNextNode().getNextNode() == null) {
                temp.setNextNode(null);
                setTail(temp);
            } else temp.setNextNode(temp.getNextNode().getNextNode());
        }
        size--;
    }

    public void sort(){
        boolean changed = false;
        Node<T> temp = head;
        Node<T> next = temp.getNextNode();
        int len = size();
        for(int i = 0; i < len; i++){
            while(next != null){
                if(temp.getValue().compareTo(next.getValue()) > 0){
                    //bubble sort
                    T temp2 = temp.getValue();
                    temp.setValue(next.getValue());
                    next.setValue(temp2);
                    changed = true;
                }
                temp = next;
                next = temp.getNextNode();
            }
            if(!changed) break; //no more to change, break
            temp = head;
            next = temp.getNextNode();
        }
    }

}
