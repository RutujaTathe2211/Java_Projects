public class ArraySubtraction {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{5,5,6},{3,4,5},{6,8,9}};
        int addition[][] = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                addition[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(addition[i][j]+"\t");
            }
            System.out.println();

        }

    }
}
