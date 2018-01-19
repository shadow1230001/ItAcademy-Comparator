package by.lyubin.comparator.runner;

import by.lyubin.comparator.bean.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
    public static void main(String[] args){

        Person person1 = new Person("Vladimir", "Lyubin", 22);
        Person person2 = new Person("Denis", "Falkovskiy", 20);
        Person person3 = new Person("Egor", "Zubkov", 16);
        Person person4 = new Person("Sasha", "Dereh", 22);
        Person person5 = new Person("Artyom", "Davidyan", 24);
        Person person6 = new Person("Evgeniy", "Lyubin", 60);
        Person person7 = new Person("Arina", "Shustal", 19);

        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        });

        Set<Person> people1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.getLastName().compareToIgnoreCase(o2.getLastName());
            }
        });
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);

        people1.add(person1);
        people1.add(person2);
        people1.add(person3);
        people1.add(person4);
        people1.add(person5);
        people1.add(person6);
        people1.add(person7);

        for(Person person: people) {
            System.out.println(person);
        }

        System.out.println("-------------------------------------------------------");

        for (Person person : people1){
            System.out.println(person);
        }


    }
}
