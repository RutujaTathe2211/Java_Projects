import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter column");
        int column=sc.nextInt();

        int arr1[][]=new int[row][column];

        System.out.println("Enter 1 array element: ");
        for(int i=0;i<row;i++){
            for(int j=0;j< column;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix is:");
        for(int i=0;i< row;i++){
            for(int j=0;j< column;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        int transpose[][]=new int [row][column];
        for(int i=0;i< transpose.length;i++){
            for(int j=0;j< transpose.length;j++){
                transpose[j][i]=arr1[i][j];
            }
        }
        System.out.println("Transpose of given matrix is:");
        for(int i=0;i< transpose.length;i++){
            for(int j=0;j< transpose.length;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
