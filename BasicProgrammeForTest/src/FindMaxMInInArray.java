import java.util.Arrays;

public class FindMaxMInInArray {
    public static void main(String[] args) {
        int arr[]={78,9,89,34,56,6,7};

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value in array is:"+max);
        System.out.println("Minimun value in array is:"+min);
    }
}
