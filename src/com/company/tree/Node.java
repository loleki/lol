package com.company.tree;

public class Node {
    private Node parent = null;
    private Node left = null;
    private Node right = null;
    private int data;

    public Node(int data){this.data = data;}

    public boolean isLeaf(){return this.left == null && this.right == null;}

    public void setLeft(Node left) {this.left = left;}
    public void setRight(Node right) {this.right = right;}
    public void setParent(Node parent) {this.parent = parent;}

    public int getData() {return data;}
    public Node getParent() {return parent;}
    public Node getLeft() {return left;}
    public Node getRight() {return right;}
}
