import sun.plugin2.message.Serializer;

import java.io.Serializable;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class Child implements Serializable {

    private int age;
    private String name;
    private transient String notSerial;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotSerial() {
        return notSerial;
    }

    public void setNotSerial(String notSerial) {
        this.notSerial = notSerial;
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", notSerial='" + notSerial + '\'' +
                '}';
    }
}
