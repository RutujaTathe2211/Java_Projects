package Collections;

import java.util.*;

public class ArrayListConcept {
    public static void main(String[] args) {
     //default class//dynamic array
        ArrayList<Object> ar=new ArrayList<Object>();
        //it will store only integer value// generic declaration
        //integer is wrapper class
        ArrayList<Integer> array=new ArrayList<Integer>();
        //store all types of data
        ar.add("Rutuja");
        ar.add(100);
        ar.add("ru");
        ar.add(true);
        ar.add(3,"asmita");
        //System.out.println(ar);
        System.out.println(ar.get(2));
        //System.out.println(ar.get(-1));//exception
        //System.out.println(ar.get(5));
        System.out.println(ar.size());
        System.out.println("lowest index: "+0);
        System.out.println("highest index: "+(ar.size()-1));


        //virtual capacity of arraylist=10
        //physical capacity of arraylist=0
        System.out.println(ar.size());//PC=5
        ar.add(100);//pc increase
        ar.add(200);
        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());//pc=9

        //typical for loop
        for(int i=0;i<ar.size()-1;i++){
            System.out.print(ar.get(i)+" ,");
        }
        System.out.println("\n.................");
        //for each loop
        for(Object i:ar){
            System.out.print(i+" ");
        }
        System.out.println(".\n................");

        //using lambda function//Streams with lambda
        ar.stream().forEach(ele-> System.out.print(ele+" "));
        System.out.println(".\n................");

        //using iterator
       Iterator<Object> it= ar.iterator();
       while (it.hasNext()){
           System.out.print(it.next()+" ");
       }
        System.out.println(".\n................");
       //using foreachRemaining
       it=ar.iterator();
       it.forEachRemaining(ele-> System.out.print(ele));
        System.out.println(".\n................");



        //list with other collection
        ArrayList list=new ArrayList(Arrays.asList(20,30,40,50,60));
        System.out.print(list);


        /*Methods:
        addAll():combine two arraylist with other
        addAll(2,arr):for which index you combine list
        clear():clear the list
        clone():create copy of arraylist into another
        contains():boolean value will be printed like true or false
        indexOf():check for that index
        lastIndexOf():get last index of arraylist
        remove():remove element from current list
        retainAll():ratain only those elements
         */

        ar.addAll(2,list);
        System.out.println("\n"+ar);

        ArrayList clonelist=(ArrayList<Object>)ar.clone();
        System.out.println(clonelist);

        System.out.println(ar.indexOf("Rutuja")<=0);
        ArrayList a2=new ArrayList(Arrays.asList("Rutu","Asmita","sakshi","Nikita","Ankita","rutu","rutu"));
        System.out.println(a2);
        int i=a2.lastIndexOf("rutu");
        System.out.println(i);
        a2.remove(6);
        System.out.println(a2);
        a2.remove("rutu");
        System.out.println(a2);
        ArrayList newlist=new ArrayList(Arrays.asList(1,2,3,4,5,2,3,5,7,8,9,10));
//        newlist.retainAll(Collections.singleton(3));
//        System.out.println("retain all:"+newlist);

        System.out.println("Even numbers are: ");
        ArrayList<Integer> even=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        even.removeIf(num->num%2 !=0);
        System.out.println(even);

        //create sublist
        ArrayList<Integer> sublist=new ArrayList<>(newlist.subList(1,6));
        System.out.println("Sublist: "+sublist);

        //toarray
       Object arr[]= newlist.toArray();
        System.out.println(Arrays.toString(arr));
        for(Object o:arr){
            System.out.print((String) o+" ");
        }





    }
}
