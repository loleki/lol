package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<Integer, String> hashtable = new HashMap<>();
    private int length;

    public Dictionary(){}

    public void put(int key, String value){
        if (this.hashtable.containsKey(key)){
            this.put(key + 1, value);
            return;
        }
        this.hashtable.put(key, value);
        this.length ++;
    }

    public String get(int key){return this.hashtable.get(key);}

    public void remove(int key){
        this.hashtable.remove(key);
        this.length--;
    }

    public Collection<String> values(){return hashtable.values();}

    public int getLength() {return length;}
}
