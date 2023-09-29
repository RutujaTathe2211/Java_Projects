import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortedList {
    public static void main(String[] args) {
        //add all list
        List<Integer> l= new ArrayList<>(Arrays.asList(10,9,8,7,6));
        List<Integer> l2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
       l.addAll(l2);

        System.out.println("------------tree--------------");
       //using set
        Set<Integer> s=new TreeSet<>();
        s.addAll(l);
        System.out.println(s);

        System.out.println("---------------collections .sort()-----------");

        //sort list
        Collections.sort(l);
        System.out.println(l);
        System.out.println("----------duplicate  ----------------");

        //remove duplicates
        Stream.of(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10).distinct().forEach(x-> System.out.print(x+" "));




    }
}
