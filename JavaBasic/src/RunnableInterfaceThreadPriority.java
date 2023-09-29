//As the Runnable interface is functional interface so we are not able to directly call start method using class object so we create thread class object passes our class object as referance.

class employee3 implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            //hi with current thread priority
            System.out.println("Hi  "+ Thread.currentThread().getPriority());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class employee4 implements Runnable {
        public void run() {
            for (int i = 0; i < 4; i++) {
                System.out.println("Hello  "+ Thread.currentThread().getPriority());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    public class RunnableInterfaceThreadPriority {
        public static void main(String[] args) throws InterruptedException {
            employee3 e = new employee3();
            employee4 e2=new employee4();

            Thread t1 = new Thread(e);
            Thread t2 = new Thread(e2);

            t1.setName("Hi Thread");
            t2.setName("Hello Thread");
//            System.out.println(t1.getName());//by default thread start from 0,1,2.....
//            System.out.println(t2.getName());

            //used to set the priority //range from 1....10 1(less),5(normal),10(high)
//            t1.setPriority(1);
//            t2.setPriority(10);

            //another way to set priority
            t1.setPriority(Thread.MAX_PRIORITY);//10
            t2.setPriority(Thread.NORM_PRIORITY);//5

            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());


            t1.start();
            System.out.println(t1.isAlive());// :o/p is true
            Thread.sleep(10);

            t2.start();
            //main Thread method//when both thread complete their task then join will combine that thread and wait
            //so main thread output printed at last

            t1.join();
            t2.join();
            System.out.println(t1.isAlive());//check status of thread whether it is in running state or not //: o/p is false
            System.out.println("Bye");
        }
    }

