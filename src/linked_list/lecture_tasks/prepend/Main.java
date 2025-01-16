package linked_list.lecture_tasks.prepend;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.printAll();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.printAll();


        /*
            EXPECTED OUTPUT:

            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2

            Linked List:
            2
            3


            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3

            Linked List:
            1
            2
            3

        */

    }
}
