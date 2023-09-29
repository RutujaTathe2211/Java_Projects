package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //store only unique value/union,intersection,mathematical operation
        Set<Object > s=new HashSet<>();
        s.add("a");
        s.add("c");
        s.add("d");
        //not store duplicate value
        s.add("d");
        s.add("e");
        s.add(null);
        System.out.println(s);
        System.out.println(s.contains("c"));//true /check whether the element is present in set or not
        s.remove("e");

        Iterator it=s.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ,");
        }
        Set<Object> s2=new HashSet<>();
        s2.add(10);
        s2.add(30);
        s.add("d");
        s.add("e");
        s.add(null);

        //Mathematical operations
        Set<Integer> first=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,9,20));
        Set<Integer> second=new HashSet<>(Arrays.asList(3,4,5,6,7,8,9));
        System.out.println("\n...................union operation................");
        Set<Object> union=new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);

        System.out.println("\n...................Intersection operation................");
        //intersection
        Set<Object> intersection=new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        //differance
        System.out.println("\n...................Differance operation................");
        Set<Object> diff=new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);

    }
}
