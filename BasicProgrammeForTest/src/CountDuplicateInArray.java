public class CountDuplicateInArray {
    public static void main(String[] args) {

      int[] a= new int[]{10, 20, 30, 40, 55, 10, 10, 20, 30};
        for(int i=0;i<a.length;i++)
        {
           int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && a[i]!=' '){
                    count++;
                    a[j]='0';
                }
            }
            if(a[i]!='0')
            {
                System.out.println(a[i]+"= "+count);
            }

        }
    }

}
