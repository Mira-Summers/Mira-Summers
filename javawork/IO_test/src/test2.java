import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    private test2(){

    }
    public static void copy(String outputPath,String inputPath) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(outputPath, true);
            fileInputStream = new FileInputStream(inputPath);
            byte[] bytes = new byte[1024 * 1024];
            int read = 0;
            while ((read = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, read);
            }

            //刷新
            fileOutputStream.flush();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
    }


    }