package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapExample {
    //data can be store in key and value pair format//no order..no indexing//key not duplicate
    //hashmap not synchronized
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String ,String>();
        map.put("1","rutuja");
        map.put("2","niku");
        map.put("3","asmita");
        map.put("4","radha");
        //only one null key will be their but many null value are their
        map.put(null,"panu");
        map.put("5",null);
        map.put("6",null);
        System.out.println(map.get(6));
        map.remove("rutuja");


        //returns sets of key
        //use of iterator over the key
        Iterator<String> it=map.keySet().iterator();
        while (it.hasNext()){
            String key=it.next();
            String value=map.get(key);
            System.out.println("key: "+key+"   value= "+value);
        }
        System.out.println("..............................");
        //use of iterator over the set(pair):using entryset()
        Iterator itr=map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String ,String> entry = (Map.Entry<String, String>) itr.next();
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
        System.out.println("..............................");

        //iterator using java 8 feacture and lambda
        map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));

    }
}
