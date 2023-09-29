import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String s="rutuja ";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        System.out.println("Revrse String is:"+rev);

       // using charArray
        char arr[]=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+arr[i];

        }
        System.out.println("Revrse String is:"+rev);

        //using StringBuffer reverse() method:
        StringBuffer buff=new StringBuffer(s);
        buff.reverse();
        System.out.println(buff);

//        List <String> s1=new ArrayList<>();
//        s1.add("rutuja");
//        s1.add("Asmita");
//        s1.add("Sakshi");
//        System.out.println(s1);
//        System.out.println("Reverse linked list:");
//        Iterator itr=s1.descendingIterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next()+" ");
//        }

    }

}
