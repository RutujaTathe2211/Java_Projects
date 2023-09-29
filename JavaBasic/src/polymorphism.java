class student{
    //encapsulation :binds data together
    private String name;
   private  int id;
   private String city;
   public void setName(String n){
       name=n;
   }
   public String getName(){
       return name;
   }
   public void setId(int i){
       id=i;
   }
   public int getId(){
       return id;
   }
   public void setCity(String c){
       city=c;
   }
   public String getCity(){
       return city;
   }
}

public class polymorphism {
    public static void main(String[] args) {
        student s=new student();
        s.setName("Rutuja");
        s.setId(111);
        s.setCity("pune");
        System.out.println("Name of the student is: "+s.getName());
        System.out.println("Id of student: "+s.getId());
        System.out.println("City in which student belong: "+s.getCity() );
    }
}
