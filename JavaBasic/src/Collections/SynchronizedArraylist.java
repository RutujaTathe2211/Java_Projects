package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArraylist {
    public static void main(String[] args) {
        //To make the list synchronized//explicit synchronization not require.
        List<String> s=Collections.synchronizedList(new ArrayList<String>());
        s.add("Rutu");
        s.add("Sushma");
        s.add("asmita");
        s.add("sakshi");
        s.add("swati");
        //to fetch the value from list we wants to use synchronized
        synchronized (s) {
            Iterator it = s.iterator();
            while ((it.hasNext())) {
                System.out.println(it.next());
            }
        }

        //2.copyOnWriteArrayList.....It is thread safe already
        CopyOnWriteArrayList<String> employeelist=new CopyOnWriteArrayList<>();
        employeelist.add("tathe");
        employeelist.add("raut");
        employeelist.add("shaha");
        employeelist.add("deshmukh");
        //we don't need any synchronization for any operation add/remove/traverse
          Iterator it= employeelist.iterator();
          while (it.hasNext())
          {
              System.out.println(it.next());
          }
    }
}
