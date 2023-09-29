package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        //data stored in sorted mannner
        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(1,"rutu");
        t.put(2,"suman");
        t.put(9,"radha");
        t.put(3,"asmita");
        t.put(4,"pornima");

        t.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        System.out.println("........................");


        //records less than 3
        System.out.println("Records less than 3: ");
        System.out.println("Highest value in map: "+t.lastKey());//highest key
        System.out.println("Lowest value in map: "+t.firstKey());//less key
       Set<Integer> lessThan3= t.headMap(3).keySet();
        System.out.println("less than 3: "+lessThan3);

        //greater than 3
        System.out.println("........................");
        System.out.println("Records greater than 3: ");
        Set<Integer> greaterThan3=t.tailMap(3).keySet();
        System.out.println("greater than 3: "+greaterThan3);

        //red-black tree-----binary tree(left side-less,right side-greater)
        System.out.println("........................");

        TreeMap<String,Integer>usermap=new TreeMap<>();
        usermap.put("Employee1",1);
        usermap.put("Employee2",2);
        usermap.put("hr",67);
        usermap.put("Owner",88);
        usermap.put("BDA",40);
        usermap.put("System ENgineer",50);
        usermap.put("QA",99);
        usermap.forEach((k,v)-> System.out.println("key :  "+k+"   value:   "+v));

        //to reverse the map :comparator
        System.out.println("........................");
        System.out.println("Reverse order:");
        TreeMap<Integer,String> t1=new TreeMap<>(Comparator.reverseOrder());
        t1.put(1,"rutu");
        t1.put(2,"suman");
        t1.put(9,"radha");
        t1.put(3,"asmita");
        t1.put(4,"pornima");

        t1.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));



    }
}
