package linked_list.interview_questions.remove_duplicates;

import java.util.HashSet;

public class LinkedList {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<Integer>();
        Node temp = null;
        Node current = head;
        if (length > 1) {
            while (current != null) {
                if (set.contains(current.value)) {
                    temp.next = current.next;
                    length--;
                } else {
                    set.add(current.value);
                    temp = current;
                }
                current = current.next;
            }
        }
    }
}
