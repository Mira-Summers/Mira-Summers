package beans;

import java.util.Date;

public class animals {
    public animals(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "animals{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public animals(){

    }
    private String name;

    private Date date;


}
