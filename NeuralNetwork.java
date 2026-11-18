package datastruct;

import java.util.LinkedList;

public class NeuralNetwork {
    Layer inputLayer;
    LinkedList<Layer> hiddenLayers;
    Layer outputLayer;

    public NeuralNetwork(int inputLayerSize, int hiddenLayersSize, int hiddenLayerNum, int outputLayerSize) {
        for(int i=0; i<inputLayerSize; i++) {
            Node n = new Node(0);
            inputLayer.AddNode(n);
        }
        for(int i=0; i<hiddenLayerNum; i++) {
            Layer hidden = new Layer();
            for(int j=0; j<hiddenLayersSize; j++) {
                Node n = new Node(0);
                hidden.AddNode(n);
            }
            hiddenLayers.add(hidden);
        }
        for(int i=0; i<outputLayerSize; i++) {
            Node n = new Node(0);
            outputLayer.AddNode(n);
        }

        InitEdges();
    }

    private void InitEdges() {
        ConnectLayers(inputLayer, hiddenLayers.get(0));
        for(int i=0; i<hiddenLayers.size()-1; i++) {
            Layer l1 = hiddenLayers.get(i);
            Layer l2 = hiddenLayers.get(i+1);
            ConnectLayers(l1,l2);
        }
        ConnectLayers(hiddenLayers.getLast(), outputLayer);
    }

    private void ConnectLayers(Layer l1, Layer l2) {
        for(Node n1 : l1.GetNodes()) {
            for(Node n2 : l2.GetNodes()) {
                n1.AddNext(n2,0);
            }
        }
    }

}
