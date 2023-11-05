import java.io.*;
import java.util.*;

//creating object of file -> File file = new File(String Pathname)
//to create file - createNewFile() returns boolean
//to read - read() , to write - write() , to delete - delete()
public class files {
    public static void main(String[] args) {
        // creating a file
        File file = new File("file1.txt");
        char[] arr = new char[100];
        try {
            boolean t = file.createNewFile();
            String data = "this is in output file";
            if (t) {// checking if it got created or not
                System.out.println("File created");
            } else {
                System.out.println("File already exista");
            }
            // reading into the file
            FileReader input = new FileReader("input.txt");
            input.read(arr);
            System.out.println("the data in the file is - ");
            System.out.println(arr);
            // closing the reader
            input.close();
            // writing into a file
            FileWriter output = new FileWriter("output.txt");
            output.write(data);
            System.out.println("Data is written into the file");
            // close the writer
            output.close();
            boolean v = file.delete();
            if (v) {
                System.out.println("The file is deleted");
            } else {
                System.out.println("The file is not deleted");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
