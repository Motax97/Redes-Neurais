package datastruct;

public class Edge {
    Node origin;
    Node dest;
    int weight;

    public Edge(Node ori, Node d, int w) {
        origin = ori;
        dest = d;
        weight = w;
    }

    @Override
    public String toString() {
        return "(" + origin + "," + dest + "," + weight + ")";
    }
}
