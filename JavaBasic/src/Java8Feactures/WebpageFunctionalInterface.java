package Java8Feactures;

//functional interface--only one abstract method
//SAM-single abstract method
//@FunctinalInterface annotation
//contain static method and default method also
@FunctionalInterface
public interface WebpageFunctionalInterface {
    public void header(String value,int age);
    public static void add(){

    }
    default void subtract(){

    }
}
