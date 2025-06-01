import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;


        try {
            fileReader = new FileReader("data.txt");

            char[]chars=new char[5];
            int read= 0;
            try {
                read = fileReader.read(chars);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(read);
            for (char aChar:chars){
                System.out.println(aChar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}