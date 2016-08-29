package com.company;

import com.sun.tools.javac.util.GraphUtils;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("Node 0");
        stringList.add("Node 1");
        stringList.add("Node 2");
        stringList.add("Node 3");
        stringList.add("Node 4");
        stringList.add("Node 5");
        

        for (int i = 0; i < stringList.getSize(); i++) {System.out.println(i + ". " + stringList.get(i));}
        System.out.println("\n");

        stringList.setHead(reverseLinkedList(stringList.getHead()));

        for (int i = 0; i < stringList.getSize(); i++) {System.out.println(i + ". " + stringList.get(i));}
        System.out.println("\n");


    }


    public static Node<String> reverseLinkedList(Node<String> head) {
        if (head.getNext() == null) {
            return head;
        } else {
            Node<String> prevNode = head;
            Node<String> currentNode = head.getNext();

            while (currentNode.getNext() != null) {
                Node<String> nextNode = currentNode.getNext();
                currentNode.setNext(prevNode);
                prevNode = currentNode;
                currentNode = nextNode;
            }

            currentNode.setNext(prevNode);
            head.setNext(null);
            return currentNode;
        }
    }


}
