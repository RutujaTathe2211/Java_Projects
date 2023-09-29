public class PallindromeNo {
    public static void main(String[] args) {
        int number=121;
        int orig_number=number;
        int rev=0;

        while(number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        System.out.println(rev);

        if(rev==orig_number){
            System.out.println("Given number is pallindrome");
        }
        else {
            System.out.println("Number is not pallindrome");
        }
    }
}
