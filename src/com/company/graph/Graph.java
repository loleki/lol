package com.company.graph;

import java.util.*;

public class Graph {
    private final Map<Integer, ArrayList<Link>> map = new HashMap<>();

    Graph(){};
    private void addLinkInMap(int vertex, Link link){
        if(this.map.containsKey(vertex)){
            this.map.get(vertex).add(link);
        }
        else{
            this.map.put(vertex, new ArrayList<Link>());
            this.addLinkInMap(vertex, link);
        }
    }

    public void addLink(int vertex1, int vertex2){
        Link link = new Link(vertex1, vertex2);
        this.addLinkInMap(vertex1, link);
        this.addLinkInMap(vertex2, link);
    }
}
