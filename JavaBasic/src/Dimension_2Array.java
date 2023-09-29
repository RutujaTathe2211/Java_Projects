import java.util.Scanner;

public class Dimension_2Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many row you wants to insert: ");
        int row=sc.nextInt();
        System.out.println("Enter how many columns you wants to insert: ");
        int columns=sc.nextInt();
       int temp=0;


        int num[][]=new int[row][columns];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                //random:takes random values
                //num[i][j]=(int)(Math.random()*10);
                num[i][j]=sc.nextInt();
            }
        }
           for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(num[i][j]+" ");
            }
               System.out.println();
        }
        System.out.println("\n");
           //n is not a single variable it is an array
           for(int n[]:num){
               //m is the element of array n
               for (int m:n){
                   System.out.print(m+" ");
               }
               System.out.println();

           }

    }
}
