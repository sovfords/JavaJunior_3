import java.io.Serializable;

public class Person implements Serializable
{
    private String name;
    private String age;
    Person(String name,String age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
