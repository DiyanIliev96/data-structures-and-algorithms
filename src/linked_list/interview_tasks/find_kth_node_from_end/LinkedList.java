package linked_list.interview_tasks.find_kth_node_from_end;

public class LinkedList {
    private Node head;
    private Node tail;
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
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // WRITE FINDKTHFROMEND METHOD HERE //
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////

    public Node removeLast() {
        Node current = head;
        if (head == tail) {
            head = null;
            tail = null;
            return current;
        }
        if (head == null || tail == null) {
            return null;
        }
        Node temp = tail;

        while (current.next != temp) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        return temp;
    }



    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node faster = head;

        for (int i = 0; i < k ; i++ ) {

            if (faster == null) {
                return null;
            }
            faster = faster.next;
        }

        while (faster != null) {
            slow = slow.next;
            faster = faster.next;
        }
        return slow;
    }
}
