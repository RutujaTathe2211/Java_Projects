import java.util.Scanner;

public class MatrixMultiplication {
    /*
    row of first matrix=column of second matrix
     */
    public static void main(String[] args) {
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter row1");
        int row1=sc.nextInt();
        System.out.println("enter column1");
        int column1=sc.nextInt();

        int arr1[][]=new int[row1][column1];

        System.out.println("enter row2");
        int row2=sc.nextInt();
        System.out.println("enter column2");
        int column2=sc.nextInt();

        int arr2[][]=new int[row2][column2];

        System.out.println("Enter 1 array element: ");
        for(int i=0;i<row1;i++){
           for(int j=0;j< column1;j++){
               arr1[i][j]=sc.nextInt();
           }
        }

        System.out.println("Enter 2 array element: ");
        for(int i=0;i< row2;i++){
            for(int j=0;j< column2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array1 is:");
        for(int i=0;i< row1;i++){
            for(int j=0;j< column1;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array2 is:");
        for(int i=0;i< row2;i++){
            for(int j=0;j< column2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int prod[][]=new int[row1][column2];//firs Matrix row// second matrix column

        for(int i=0;i< row1;i++){
              for(int j=0;j< column2;j++){
                  for(int k=0;k<column1;k++){//column one
                      sum=sum+arr1[i][k]*arr2[k][j];
                  }
                  prod[i][j]=sum;
                  sum=0;
              }

        }
        for(int i=0;i<row1;i++){
            for(int j=0;j< column2;j++){
                    System.out.print(prod[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
