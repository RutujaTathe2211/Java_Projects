public class StringToggle {
    public static void main(String[] args) {
        String s="rutuja is my name";
        String[] arr =s.split("\\s");
        String toggle="";
        for(String a:arr){
            String first=a.substring(0,1);
            String second=a.substring(1);
            toggle+=first.toLowerCase()+second.toUpperCase()+" ";
        }

        System.out.println(toggle.toString());

    }
}
