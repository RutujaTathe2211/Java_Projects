package Java8Feactures.Streams.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int id;
    private Set<String> devices;

//    public Student(String name, int id, Set<String> devices) {
//        this.name = name;
//        this.id = id;
//        this.devices = devices;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<String> getDevices() {
        return devices;
    }

    public void setDevices(Set<String> devices) {
        this.devices = devices;
    }

    public static void main(String[] args) {

    }
    public void devicesName(String devicename){
        if(devices==null){
            this.devices=new HashSet<>();
        }
        this.devices.add(devicename);
    }
}
