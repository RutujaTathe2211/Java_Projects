package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashmapComparison {
    public static void main(String[] args) {
      HashMap <Integer,String> m=new HashMap<>();
      m.put(1,"r");
      m.put(2,"a");

        HashMap <Integer,String> n=new HashMap<>();
        n.put(1,"r");
        n.put(2,"a");

        HashMap <Integer,String> o=new HashMap<>();
        o.put(1,"r");
        o.put(2,"a");
        o.put(3,"s");
        o.put(4,"d");

        //1.compare map using equals()
        System.out.println(m.equals(n));//true
        System.out.println(n.equals(o));//false

        //2.By comparing keys
        System.out.println(m.keySet().equals(n.keySet()));//true
        System.out.println(n.keySet().equals(o.keySet()));//false

        //3.finding extra key
        //combine key from both hashmap--create hashset then
        //store only one element duplicate value ignored--add first map key element
        HashSet<Integer> combinekey=new HashSet<>(m.keySet());
        //combine second map key element
        combinekey.addAll(o.keySet());
        //remove first map key element
        combinekey.removeAll(m.keySet());
        System.out.println(combinekey);

        //4.compare using value:duplicate not allowed:arraylist
        System.out.println(new ArrayList<>(m.values()).equals(new ArrayList<>(n.values())));//true
        System.out.println(new ArrayList<>(n.values()).equals(new ArrayList<>(o.values())));//false
        //2.duplicate are allowed:hashset
        System.out.println(new HashSet<>(m.values()).equals(new HashSet<>(n.values())));//true
        System.out.println(new HashSet<>(n.values()).equals(new HashSet<>(o.values())));//true




    }
}
