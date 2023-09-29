import java.util.stream.Stream;

public class SecondLargestInARray {
    public static void main(String[] args) {
        int a[]={10,45,6,78,7,3,2,1,90};
        //take the less value that easily updated with any value of array
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;


//        int highest=a[0];
//      for(int i=0;i<a.length-1;i++){
//          if(a[i]<a[i+1]){
//              highest=a[i+1];
//          }
//      }
//        System.out.println(highest);
        for(int i:a){
            if(i>highest){
                secondHighest=highest;
                highest=i;
            }else if(i>secondHighest){
                secondHighest=i;
            }
        }
        System.out.println(secondHighest);
   }
}
