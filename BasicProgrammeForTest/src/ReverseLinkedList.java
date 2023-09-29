import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(2,4,5,67,78,99));

        System.out.println(ll);
        LinkedList<Integer> l = new LinkedList<>();

        ll.descendingIterator().forEachRemaining( l::add);
        System.out.println(l);



    }

}
