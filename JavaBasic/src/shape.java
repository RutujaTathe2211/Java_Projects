
//for abstarct class we needs to create another class
//final method not override
public abstract class shape {
    int colour=5;
    abstract  void drawing();
    void show(){
        System.out.println("Show method.");
    }
    //can not create object
}
class Base extends shape{

    @Override
    void drawing() {
        System.out.println("Drawing method");
    }

    public static void main(String[] args) {
        shape s=new Base();
        s.drawing();
        System.out.println(s.colour);


    }
}
