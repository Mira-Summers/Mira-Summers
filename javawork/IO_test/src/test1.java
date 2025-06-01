import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test1 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream=new FileInputStream("D:\\javawork\\iotest1.txt");
            byte[] bytes = new byte[4];
            int read=0;
            while(true){
                try {
                    if (((read=fileInputStream.read(bytes))!=-1)) {
                        String str = new String(bytes, 0, read);
                        System.out.println(str);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
