import java.io.*;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream("IOtext2")));

        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("data3.txt"));
        bufferedWriter.write("Hello,world!");
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
