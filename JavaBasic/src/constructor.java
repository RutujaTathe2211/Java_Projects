public class constructor {
    //class variable: instance variable
        String name;
        int id;
        public constructor(){
            System.out.println("default constructor");
        }
        public constructor(String name1,int id1){
           this.name=name1; //initialize class variable
           this.id=id1;

        }

    public static void main(String[] args) {
        constructor c=new constructor("rutuja",11);//parametrized
        constructor c1=new constructor();
        System.out.println("name: "+c.name+" id: "+c.id);

    }

}
