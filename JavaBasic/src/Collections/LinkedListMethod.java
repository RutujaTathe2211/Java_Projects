package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod {
    public static void main(String[] args) {
        /*
        -default class in java
        -implement queue and deque(list,stack,queue)
        -dynamic collection/contain duplicate element/not synchronized
        -manipulation is fast ,no shifting will be thier
         */
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(70);
        System.out.println("size: "+l.size());//get size of linked list
        System.out.println("second index element: "+l.get(2));
        l.add(2,34);//at second index new element added

        Iterator it=l.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //addAll():Adding other collection in first collection
        //addLast():add element at last
        //addFirst():add element at first position
        //remove:remove element
        //removeFirst(),removeLast()
        //clear():clear all element of list

        //reverse linked list:descending iterator should be their
        System.out.println("\nReverse order linked list: ");
        Iterator itr=l.descendingIterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        //sorting
        System.out.println("\nsorting linked list: ");
        Collections.sort(l);
        System.out.println(l);

        //using lambda traverse linked list
       // l.forEach(integer -> System.out.println(integer));
    }
}
