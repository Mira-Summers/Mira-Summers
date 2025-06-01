package com.eagles.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        //创建集合对象
        Properties properties = new Properties();

        FileReader fileReader = null;


        try {
            //创建一个流对象
            fileReader = new FileReader("db.properties");

            //集合流对象读取配置文件中的数据
            properties.load(fileReader);

            String driver = properties.getProperty("db.driver");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            System.out.println(driver);
            System.out.println(username);
            System.out.println(password);


        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        } finally {

            try {

                fileReader.close();//回收资源

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }


    }

}
