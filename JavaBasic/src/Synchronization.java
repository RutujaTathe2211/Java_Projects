class counter{
    int count;
    public  synchronized void increment(){
        count++;
    }
}


public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
     counter c=new counter();
     //using lambda expression
     Thread t1=new Thread(() -> {
         for(int i=1;i<=1000;i++){
             c.increment();
         }
     });
     //using anonymous function
        Thread t2=new Thread(new Runnable() {
            public void run() {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
     t1.start();
     t2.start();
     t1.join();//wait for t1 to complete its task
        t2.join();
        System.out.println("counter is: "+c.count);
    }
}
