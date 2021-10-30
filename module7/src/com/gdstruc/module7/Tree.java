package com.gdstruc.module7;

public class Tree {

    Node root;
    public Node rightMaximum;


    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node getMin(Node node)
    {
        while(node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public Node getMax(Node node)
    {
        while(node.rightChild != null) {
            node = node.rightChild;
        }
        return node;
    }

}
