public class ExceptionHandling {
/*
three types of exception handling
1.try catch block
2.
 */
    //exception :error
    public static void main(String[] args) {
        try{
            int a=19/0;

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());//tells which type of error we get
            e.printStackTrace();//give which type of exception it is.
        }
        int a=10;
        //un-caught Exception
//        int i=9/0;
//        System.out.println(i);

        //caught exception
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ExceptionHandling e=null;
        System.out.println(e);
        ExceptionHandling e2=new ExceptionHandling();
    }


}
