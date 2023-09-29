import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysEquals {

    public static void main(String[] args) {

        Integer arr[]={1,2,3,2,1};
        Integer arr2[]={1,2,3};
        Integer arr3[]={1,2,3,4};
        Set<Integer> s=new HashSet<>(Arrays.asList(arr));
        Set<Integer> s2=new HashSet<>(Arrays.asList(arr2));
        Set<Integer> s3=new HashSet<>(Arrays.asList(arr3));


        System.out.println(s.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s.equals(s3));




    }
}
