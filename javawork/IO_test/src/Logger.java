import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
        private Logger() {

        }
        /**
         * @param message
         */

        public static void logger(String message) {
            PrintStream printStream = null;
            try {
                printStream = new PrintStream(new FileOutputStream("logger.txt", true));
                System.setOut(printStream);
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String time = simpleDateFormat.format(date);
                System.out.println(time+"----"+message);
                printStream.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }finally {
                if(printStream!=null){
                    printStream.close();
                }
            }



        }
    }

