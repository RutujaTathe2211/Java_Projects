public class LoopsConcept {
    //Global variable:declare immediate after class
    //for acessing global variable we need to create class object
    int ab=90;
    int bc=80;
    public void math(){
        int a=20;//local variable for math()
        int b=30;
        System.out.println("Addition of two number is: "+(a+b));
    }
    //Starting point of execution
    public static void main(String[] args) {
        LoopsConcept lc=new LoopsConcept();

        System.out.println(lc.ab);//global variable acess using obj.variableName
        System.out.println(lc.bc);

        lc.math();
        //1.while loop
        int i=0;//local variable for main method
        while(i<10){
            System.out.print(i+" ");
            i++;
        }

//        //for loop
//        for(int j=0;j<10;j++){
//            System.out.print(j);
//        }
    }
}
