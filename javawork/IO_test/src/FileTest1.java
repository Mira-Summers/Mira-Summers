import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FileTest1 {
    public static List<File> fileList=new ArrayList<>();

    public static void main(String[] args) {
        File file=new File("D:\\javawork\\data");

        isFile(file)
        }

        File[] listFile=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return file.getPath().endsWith(".java");}
            for (File listFile:listfiles){
                System.out.println(listFile.getPath());

            }

        });

    }
}
