package com.company.list1;

public class Node {
    private Node prev = null;
    private Node next = null;
    private Integer data;

    Node(){this.data = null;}
    Node(int data){this.data = data;}

    public Integer getData() {return data;}
    public Node getNext() {return next;}
    public Node getPrev() {return prev;}

    public void setNext(Node next) {this.next = next;}
    public void setPrev(Node prev) {this.prev = prev;}
}
