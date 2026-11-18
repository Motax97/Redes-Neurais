package datastruct;

import java.util.LinkedList;

public class Node {
    public LinkedList<Edge> nexts;
    int val;

    public Node(int v) {
        val = v;
        nexts = new LinkedList<Edge>();
    }
    
    public Edge AddNext(Node n, int w) {
        Edge e = new Edge(this, n, w);
        nexts.add(e);
        return e;
    }

    @Override
    public String toString() {
        return "NodeVal:" + val;
    }
}
