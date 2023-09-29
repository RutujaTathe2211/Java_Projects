public class ThrowsAndThrow {
    //object is superclass of all the classes..object->throwable->throw,throws
    //Throwable class(super class):If any error or exception occur then they can handle by throwable class
        public void div() {
            int a=89/0;

        }
//    public void div() throws ArithmeticException{
//        int a=89/0;
//
//    }

    public static void main(String[] args) throws ArithmeticException {
        ThrowsAndThrow t=new ThrowsAndThrow();
        t.div();

//use of throw keyword
        System.out.println("ABC");
        try {
            throw new Exception("NaveenException");
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }

}
