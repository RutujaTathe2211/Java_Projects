package Java8Feactures.Streams.flatmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSetWithFlatmap {
    public static void main(String[] args) {
         Student student=new Student();
         student.setName("naveen");

         student.devicesName("iphone");
         student.devicesName("mobile");
         student.devicesName("laptop");
        student.devicesName("iphone9");

        Student student2=new Student();
        student2.setName("tom");
        student2.devicesName("iphone9");
        student2.devicesName("macbook");
        student2.devicesName("hp lappy");

        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);

       List<String> devicelist= studentList.stream().map(x->x.getDevices())//stream of string [stream<set<String>>]
                .flatMap(x->x.stream())//stream<String
               .distinct()
                .collect(Collectors.toList());

       devicelist.forEach(System.out::println);



    }
}
