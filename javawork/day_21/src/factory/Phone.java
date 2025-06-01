package factory;

public class Phone {
    public Phone( String name) {
        this.id = num++;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return num;
    }

    public void setSize(Integer size) {
        this.num = size;
    }

    private Integer id;

    private String name;

    private Integer num=10000;

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
