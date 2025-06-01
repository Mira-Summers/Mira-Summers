package spring.pojo;

import spring.ioc.annotations.Component;

import java.util.Date;
@Component
public class Teacher {
    private int id;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    private String Name;

}
