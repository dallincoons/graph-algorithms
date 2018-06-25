package com.dallincoons;

public class Main {

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        BreadthFirstPaths search = new BreadthFirstPaths(G, s);

        System.out.println(search.pathTo(3));

    }
}
