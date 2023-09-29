import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class copyElementOfOneArray {
    public static void main(String[] args) {
        int a[]={56,78,90,7,6,8,9};

        int a2[] = new int[a.length];
//        List<Integer> a2copy=new ArrayList<>(Arrays.asList(a));
//
//        System.out.println(a2copy);
//        
        //second way
        for(int i=0;i<a.length;i++) {
            a2[i] = a[i];
        }
        for(int i=0;i<a2.length;i++) {
            System.out.print(a2[i] +" ");
        }

    }
}
