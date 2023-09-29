public class SumOfDigit {
    public static void main(String[] args) {
        int number=9999;
        int sum=0;
     while( number>0){
         int Digit=number%10;
         sum=sum+Digit;
         number=number/10;
        }
        System.out.println(sum);
    }
}
