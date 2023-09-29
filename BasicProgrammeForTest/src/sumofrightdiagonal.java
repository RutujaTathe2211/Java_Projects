public class sumofrightdiagonal {
    public static void main(String[] args) {
        int arr[][]={{7,9,8},{6,5,9},{8,4,8}};
        int sum=0;
        System.out.println("Given Matrix is:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    sum=sum+arr[i][j];
                }
            }
        }
        System.out.println("Addition of right diagonal element is:"+sum);
    }
}
