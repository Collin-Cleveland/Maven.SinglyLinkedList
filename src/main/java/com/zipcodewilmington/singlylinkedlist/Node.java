package com.zipcodewilmington.singlylinkedlist;

public class Node<T extends Comparable<T>>{

    T value;
    Node<T> nextNode;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.nextNode = next;
    }

    public Node (T data){
        this.value = data;
        this.nextNode = null;
    }

    public Node<T> getNextNode() {return nextNode;}

    public void setNextNode(Node<T> nextNode) {this.nextNode = nextNode;}

    public T getValue() {return value;}

    public void setValue(T value) {this.value = value;}

}
