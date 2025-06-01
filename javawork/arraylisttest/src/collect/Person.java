package collect;

public abstract class Person {

    private String name;

    private Integer age;

    private String address;

    public Person(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

   //对person进行重载，重载是同一类中，方法名相同，参数列表不同的一组方法的应用。
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Person() {}//创建一个空的对象，不提供参数。

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getAddress() {return address;}
    public void setAssress(String address) {this.address = address;}

    public Integer age(){return age;}
    public void setAge(Integer age) {this.age = age;}

}