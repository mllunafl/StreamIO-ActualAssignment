import java.io.Serializable;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class Parent implements Serializable{

    private int year;
    private String person;
    private Child child;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "year=" + year +
                ", person='" + person + '\'' +
                ", child=" + child +
                '}';
    }
}
