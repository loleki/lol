package com.company.tree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int root){this.root = new Node(root);}
    public BinaryTree(){};

    public void insert(int data){
        Node node = new Node(data);
        if (this.root == null){this.setRoot(node);}
        else{
            Node cur = this.root;
            while(true){
                if(cur.getData() < node.getData()){
                    if (cur.getRight() == null){
                        cur.setRight(node);
                        node.setParent(cur);
                        break;
                    }
                    else{cur = cur.getRight();}
                }
                else{
                    if(cur.getLeft() == null){
                        cur.setLeft(node);
                        node.setParent(cur);
                        break;
                    }
                    else{cur = cur.getLeft();}
                }
            }
        }
    }


    private  void setNewRoot(Node node, Node parent){
    }

    private void replaceLeaf(Node node){
        if(node.getParent().getLeft() == node){
            node.getParent().setLeft(null);
            return;
        }
        node.getParent().setRight(null);
    }

    private void replaceNode(Node node){
        if(node.isLeaf()){
            this.replaceLeaf(node);
            return;
        }

        if(node.getLeft() == null){
            node = node.getRight();
            node.setParent(null);
            return;
        }

        if (node.getRight() == null){
            node = node.getLeft();
            node.setParent(null);
            return;
        }

        Node cur = node.getRight();
        while (cur.getLeft() != null){cur = cur.getLeft();}
        cur.setLeft(node.getLeft());
        cur.getLeft().setParent(node.getRight());
        if(node == this.root){
            this.root = node.getRight();
            node.getRight().setParent(node.getParent());
        }
        else{
            if(node.getParent().getLeft() == node){node.getParent().setLeft(node.getRight());}
            else{node.getParent().setLeft(node.getRight());}
            node.getRight().setParent(node.getParent());
        }
    }

    public void delete(int data){
        Node cur = this.root;
        while (cur.getData() != data){
            if (cur.getData() < data){cur = cur.getRight();}
            else {cur = cur.getLeft();}
        }
        this.replaceNode(cur);
    }

    public void setRoot(Node root) {this.root = root;}
}
