package Package;

import java.util.Iterator;
import java.lang.Comparable;

public abstract class Person implements Comparable<Person>, Payable {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;

    public Person() {
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        this.setName(name);
        this.setSurname(surname);
    }



    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getSurname() {

        return surname;
    }
    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getId() {

        return id;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public int compareTo(Person t) {
        if (getPaymentAmount() == t.getPaymentAmount()){
            return 0;
        }
        else if(getPaymentAmount() < t.getPaymentAmount()){
            return -1;
        }
        else{
            return 1;
        }
    }
}