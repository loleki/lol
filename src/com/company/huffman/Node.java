package com.company.huffman;

public class Node {
    private Character ch;
    private int frequncy;
    private Node left = null;
    private Node right = null;

    public Node(Character ch, int frequncy){
        this.ch = ch;
        this.frequncy = frequncy;
    }

    public int getFrequncy() {return frequncy;}
    public Character getCh() {return ch;}
    public Node getLeft() {return left;}
    public Node getRight() {return right;}

    public boolean isLeaf(){return this.left == null && this.right == null;}

    public void setLeft(Node left) {this.left = left;}
    public void setRight(Node right) {this.right = right;}
}
