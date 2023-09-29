import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
    String name;
    int id;
    long mobNo;

    public Employee(String name, int id, long mobNo) {
        this.name = name;
        this.id = id;
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mobNo=" + mobNo +
                '}';
    }

    public static void main(String[] args) {
        Employee e=new Employee("rutuja",10,7066905814L);
        Employee e2=new Employee("radha",11,7066905814L);
        Employee e3=new Employee("Asmita",38,7066905814L);
        Employee e4=new Employee("Sakshi",46,7066905814L);
        Employee e5=new Employee("Nikita",90,7066905814L);


        List<Employee> data=new ArrayList<>();
        data.add(e);
        data.add(e2);
        data.add(e3);
        data.add(e4);
        data.add(e5);
        for (Employee employeedata:data
             ) {
            System.out.println(employeedata);

        }

    }
}
