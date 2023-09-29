import java.util.Scanner;

public class countEvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int evenCount=0;
        int oddCount=0;
        int rem=0;

        while(num>0){
            rem=num%10;
            //check for last digit
            if(rem%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            num=num/10;

        }
        System.out.println("even NUmber count is:"+evenCount);
        System.out.println("odd Number count is:"+oddCount);

    }
}
