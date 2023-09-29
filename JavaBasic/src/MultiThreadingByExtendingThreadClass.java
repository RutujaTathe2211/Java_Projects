class hi extends Thread{
 public void run()  {
     for(int i=0;i<5;i++){
         System.out.println("Hi!!!!!!!");
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
 }
}
class hello extends Thread {
   public  void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello!!!!!!!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class MultiThreadingByExtendingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        hi H=new hi();
        hello he=new hello();

        H.start();//used to run thread class
        Thread.sleep(10);//there is overrriding between hi and hello so we use sleep method
        he.start();
//        H.run();//whenever we call start method run method also called
//        he.run();
    }
}

