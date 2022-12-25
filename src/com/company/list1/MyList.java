package com.company.list1;

public class MyList {
    private Node head = null;
    private Node tail = null;
    private int length;

    public MyList(){}
    public MyList(int[] data){
        for(int elem: data){
            this.add(elem);
        }
    }

    public void add(int elem){
        Node node = new Node(elem);
        if (this.head == null){this.head = this.tail = node;}
        else {
            this.tail.setNext(node);
            node.setPrev(this.tail);
            this.tail = node;
        }
        length++;
    }

    public void addInHead(int elem){
        Node node = new Node(elem);
        if (this.head == null){this.head = this.tail = node;}
        else {
            this.head.setPrev(node);
            node.setNext(this.head);
            this.head = node;
        }
        length++;
    }

    public void remove(int elem){
        Node curNode = this.head;
        while (curNode.getData() != elem){
            curNode = curNode.getNext();
        }
        if(curNode.getPrev() != null){curNode.getPrev().setNext(curNode.getNext());}
        else{this.head = curNode.getNext();}
        if(curNode.getNext() != null){curNode.getNext().setPrev(curNode.getPrev());}
        else{this.tail = curNode.getPrev();}
    }

    public void removeByIndex(int index){
        Node curNode = this.head;
        for(int i = 0; i < index; i++){
            curNode = curNode.getNext();
        }
        if(curNode.getPrev() != null){curNode.getPrev().setNext(curNode.getNext());}
        else{this.head = curNode.getNext();}
        if(curNode.getNext() != null){curNode.getNext().setPrev(curNode.getPrev());}
        else{this.tail = curNode.getPrev();}
    }

    public boolean isNull(){
        return this.length == 0;
    }

    public Node getHead() {return head;}
    public Node getTail() {return tail;}
    public int getLength() {return length;}
}
