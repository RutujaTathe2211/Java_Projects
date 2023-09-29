public class ReverseEachWord {
    public static void main(String[] args) {
        String s="java is my favourite language";
        //convert string to word
        String word[]=s.split("\\s");
        //for outer string
        String rev="";
        for(int i=0;i<word.length;i++){
            //to reverse the inner array of string of word
            String innerArray=word[i];
            String reverseWord="";
            for(int j=innerArray.length()-1;j>=0;j--){
                reverseWord=reverseWord+innerArray.charAt(j);
            }
            rev=rev+reverseWord+" ";
        }
        System.out.println(rev);
    }
}
