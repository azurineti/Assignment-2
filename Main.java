package Package;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student s1 = new Student("Tanya", "Izotova", 3.99);
        Student s2 = new Student("Cheburashka", "Gena", 2.55);
        Employee e1 = new Employee("Ariella", "Ahmetzyanova", "Engineer", 500000);
        Employee e2 = new Employee("Yevgeniy", "Ahmetzyanov", "Photographer", 7000);

        ArrayList<Person> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(e1);
        list.add(e2);

        Collections.sort(list);

        printData(list);

    }
    public static void printData(Iterable<Person> list){
        for(Payable p : list){
            System.out.println(p.toString() + "earns " + p.getPaymentAmount() + " tenge.");
        }
    }

}