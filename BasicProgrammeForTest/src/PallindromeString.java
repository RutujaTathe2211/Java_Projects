import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
       // String s="Rutuja";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        String original=s;
        String reverseString="";
        for(int i=s.length()-1;i>=0;i--){
            reverseString=reverseString+s.charAt(i);
        }
        System.out.println("Original String is:"+original);
        System.out.println("Reverse String is:"+reverseString);

        if(reverseString.equals(original)){
            System.out.println(original+" String is Palindrome");
        }else{
            System.out.println(original+"Given String is Not palindrome");
        }
    }
}
