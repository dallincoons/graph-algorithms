package com.dallincoons;

public class Main {

    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        DepthFirstPaths search = new DepthFirstPaths(G, s);

        System.out.println(search.hasPathTo(s));

    }
}
