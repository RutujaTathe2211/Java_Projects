public class RevreseNo {
    public static void main(String[] args) {
        int number=124;
      int rev=0;
        while(number!=0){
             rev=rev*10+number%10;
             number=number/10;

        }
        System.out.println(rev);

        //using string buffer:valueOf()
        int num=7658438;
        StringBuffer buff=new StringBuffer(String.valueOf(num));
        StringBuffer reverse=buff.reverse();
        System.out.println(reverse);

        //using stringbuilder
        int num2=8965;
        StringBuilder builder=new StringBuilder();
        StringBuilder revNum=builder.append(num2);
        revNum.reverse();
        System.out.println(revNum);

    }
}
