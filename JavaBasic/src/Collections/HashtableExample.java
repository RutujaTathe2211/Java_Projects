package Collections;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> h=new Hashtable<>();
        //not store null value //synchronized
        h.put(1,"rutu");
        h.put(2,"asmita");
        //h.put(3,null);
        //(hashcode)%11(initial capacity)---index   .......element store at particular index in hashtable
        //when collision(index in same) is occur then the next node will be store after the first node
        h.put(4,"nikita");
        System.out.println(h.get(3));//through null pointer exception
        System.out.println(h.get(4));//nikita

    }
}
