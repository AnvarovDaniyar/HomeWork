package org.example.hw2;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        LinkedList node = new LinkedList();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);

        node.print();

        node.revert();
        node.print();
    }
}
