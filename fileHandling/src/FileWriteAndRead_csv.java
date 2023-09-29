import java.io.*;
import java.util.Scanner;

public class FileWriteAndRead_csv {
    public static void main(String[] args) throws IOException {
        String[][] employees = {
                {"FirstName","Password","Email","Department"},
                {"Rutuja", "Rutuja123", "rutujatathe.2211@gmail.com", "Engineering"},
                {"Asmita", "asmita890", "asmitaraut@gmail.com", "Engineering"},

        };

        //Write contents in file
        File f = new File("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\File3.csv");
        FileWriter fw = new FileWriter(f);
        for (String[] data : employees) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                sb.append("\"");
                sb.append(data[i].replaceAll("\"", "\"\""));
                sb.append("\"");
                if (i != data.length - 1) {
                    sb.append(',');
                }
            }
            sb.append("\n");
            fw.write(sb.toString());
        }
        fw.close();
        System.out.println("Content is sucessfull added into the file.");

        //read csv file
        Scanner sc=new Scanner(new File("C:\\Users\\NTS-Rutuja Tathe\\IdeaProjects\\File3.csv"));
        sc.useDelimiter("@");  //sets the delimiter pattern
        while(sc.hasNext()){  //returns boolean value
            System.out.println(sc.next()); //find and return the line
        }
        sc.close(); //close scanner

    }
}


