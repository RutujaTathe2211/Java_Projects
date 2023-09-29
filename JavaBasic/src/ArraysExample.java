public class ArraysExample {
    public static void main(String[] args) {
        int a[]=new int[4];
        //int a[]={2,3,4,5};
        a[0]=6;
        a[1]=3;
        a[2]=10;
        a[3]=9;

        //System.out.println(a[1]);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
