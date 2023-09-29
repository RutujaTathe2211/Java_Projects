package Java8Feactures.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierFI {
    /*
    -not take any argument but written something/result
     */
    public static void main(String[] args) {
        //take no argument return result
        getText(()->"java");
        getText(()->"Python");
        getText(()->"Html");


    }
    public static void getText(Supplier<String> text){
        System.out.println(text.get().length());
    }
}
