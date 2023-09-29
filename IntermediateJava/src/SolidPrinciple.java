public class SolidPrinciple {
    public static void main(String[] args) {
        /*
        Use:-
        1.Used to reduce dependency
        2.used to maintain code usability,maintainability,accountability,Testability of code
        3.make design easy to understand,build adaptive software

        *Solid principles:
        1.single responsibility -one class have only one responsibility
        -like we will create employee class for storing id and name then for storing address we needs to create other class
        -and used address class object in employee class.

        2.open/closed -classes should be open for extension but closed for modifications
       - open for extension-we can add extra functionality by extending class in our code without affecting existing code
        -closed for modification: after adding functionality our code will not change

        3.liskov substitution:Derived class must be completely substitute base class,means by passing derived class object to function it will work same as base class object

        4.interface aggregation:single responsibility interface
        -client should not force to implement unnecessary methods of interface which are not used

        5.dependency inversion:Depend on abstraction not on concretion
        -Avoid tight coupling

         */
    }
}
