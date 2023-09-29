class A{
    //multiple inheritance not supported
    // due to ambiguities  :if both parent class contain same method
    public void show(){
        System.out.println("show method");
    }
}
class B extends A{
    void out(){
        System.out.println("Output");
    }
}

public class Inheritance {
    public static void main(String[] args) {
         B ba=new B();
         ba.show();//acess parent class method
         ba.out();
    }
}
