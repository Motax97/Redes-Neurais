package datastruct;

import java.util.LinkedList;

public class Layer {
    LinkedList<Node> nodes;

    public Layer() {
        nodes = new LinkedList<Node>();
    }

    public void AddNode(Node n) {
        nodes.add(n);
    }

    public LinkedList<Node> GetNodes() {return nodes;}

    @Override
    public String toString() {
        String str = "";
        for(Node n : nodes) {
            str += n.toString() + "\n";
        }
        return str;
    }
}
