package com.company;

/**
 * Created by davidstone on 8/28/16.
 */
public class MyLinkedList<T> {

    private Node<T> head;
    private int size = 0;



    public int getSize() {
        return size;
    }

    public boolean remove(int index) {
        Node<T> currentNode = head;
        Node<T> previousNode = null;
        if (size == 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < size; i++) {
                if (index == 0) {
                    if (currentNode.getNext() != null) {
                        head = currentNode.getNext();
                    } else {
                        head = null;
                    }
                } else if (index == i) {
                    previousNode.setNext(currentNode.getNext());
                } else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }

        size--;
        return true;
    }

    public T get(int index) {
        Node<T> currentNode = null;
        if (size == 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            currentNode = head;
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    break;
                } else {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return currentNode.getData();
    }

    public void add(T obj) {
        if (size == 0) {
            head = new Node<T>(obj, null);
        } else {
            Node<T> currentNode = head;
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<T>(obj, null));
        }

        size++;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> h) {
        head = h;
    }





}
