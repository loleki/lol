package com.company;

import java.util.*;

public class MyStack {
    private List<Integer> stack;
    private int length = 0;

    MyStack(){this.stack = new ArrayList<Integer>();}
    MyStack(int[] data){
        this.stack = new ArrayList<Integer>();
        for (int elem: data) {
            this.stack.add(elem);
            length++;
        }
    }

    public void add(int elem){
        this.stack.add(elem);
        this.length++;
    }

    public int pop(){
        int elem = stack.get(this.length - 1);
        stack.remove(this.length - 1);
        this.length--;
        return elem;
    }

    public void print(){
        for(int i = this.length - 1; i >= 0; i-- ) {
            System.out.println(this.stack.get(i));
        }
    }
}
