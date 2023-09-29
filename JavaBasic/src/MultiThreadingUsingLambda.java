//Runnable interface is functional interface:so we use lambda expression because we don't have start method

public class MultiThreadingUsingLambda {
    public static void main(String[] args) throws InterruptedException {
        //as we call our start class method we need to pass object of our class to Thread object
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Hiii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
);
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

       t1.start();
       Thread.sleep(10);
       t2.start();

    }
}
