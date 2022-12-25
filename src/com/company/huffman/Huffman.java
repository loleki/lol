package com.company.huffman;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    public static void createTree(String text){
        Map<Character, Integer> m = new HashMap<>();

        for(char c: text.toCharArray()){
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getFrequncy));
        for(var i: m.entrySet()){
            pq.add(new Node(i.getKey(), i.getValue()));
        }

        while(pq.size() != 1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node(null, left.getFrequncy() + right.getFrequncy());
            newNode.setLeft(left);
            newNode.setRight(right);
            pq.add(newNode);
        }
        Node root = pq.peek();

        Map<Character, String> code = new HashMap<>();
        encode(root, "", code);
        System.out.println(code);

    }

    public static void encode(Node root, String s, Map<Character, String> m){
        if (root == null) return;
        if (root.isLeaf()) m.put(root.getCh(), s.length() > 0 ? s: "1");
        encode(root.getLeft(), s + '0', m);
        encode(root.getRight(), s + '1', m);
    }
}
