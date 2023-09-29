import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String s="rutuja";
        String s2="ajutur";
       char as[]=s.toCharArray();
       char as2[]=s2.toCharArray();
        if(s.length()==s2.length()){
            Arrays.sort(as);
            Arrays.sort(as2);
        }
        System.out.println(as);
        System.out.println(as2);
        if(Arrays.equals(as,as2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
