package pkg2;
//for using class that is present in another class then we needs to import that pkg in our programme
import Pkg1.*;//only import the class1 methods not class2 method

import static Pkg1.inside.class2.*;//import all method of class2


public class class3 extends class1 {
    public static void main(String[] args) {
        class1 co=new class1();
        //public variable are accessible outside pkg
        System.out.println(co.a);
        //System.out.println(c.b);    //private variable not accessible
        System.out.println(co.c); //not accessible in nonsubclass//accessible in subclass
        System.out.println(s);
    }
}
