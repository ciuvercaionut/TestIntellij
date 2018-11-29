package com.objectcontainers.homework;

import java.util.*;

public class ToDo {

    public void orderByNameAndAge() {

        List<Person> people = new ArrayList<>();

        people.add(new Employed("John", 24, "1234"));
        people.add(new Employed("Anne", 26, "2236"));
        people.add(new Unemployed("Bryan", 31, "1331"));
        people.add(new Student("Mary", 20, "2220"));
        people.add(new Unemployed("Chris", 25, "1335"));
        people.add(new Student("Sarah", 22, "2222"));


        System.out.println("List of peope before ordering: ");
        System.out.println(people);


        Set<Person> byName = new TreeSet<>(new NameComparator());

        byName.addAll(people);

        System.out.println("\nList of persons ordered by name is: ");
        System.out.println(byName);

        Set<Person> byAge = new TreeSet<>(new AgeComparator());

        byAge.addAll(people);

        System.out.println("\nList of perons ordered by age is: ");
        System.out.println(byAge);
    }

    void printHobbiesAndWhere() {

        List<Person> people = new ArrayList<>();

        people.add(new Employed("John", 24, "1234"));
        people.add(new Employed("Anne", 26, "2236"));
        people.add(new Unemployed("Bryan", 31, "1331"));
        people.add(new Student("Mary", 20, "2220"));
        people.add(new Unemployed("Chris", 25, "1335"));
        people.add(new Student("Sarah", 22, "2222"));

        Address a1 = new Address("Romania", "Cluj", "Somesului", 3);
        Address a2 = new Address("Hungary", "Budapest", "Andrassy", 42);
        Address a3 = new Address("Italy", "Udine", "Viale Venezia", 302);
        Address a4 = new Address("Belgium", "Charleroi", "Rue de France", 222);
        Address a5 = new Address("Romania", "SatuMare", "Lucian Blaga", 330);

        List<Hobby> hobbies = new ArrayList<>();

        hobbies.add(new Hobby("Jogging", 4, a1, a2, a3, a4, a5));
        hobbies.add(new Hobby("Cycling", 4, a1, a3, a4, a5));
        hobbies.add(new Hobby("KangooJumps", 3, a1, a4));
        hobbies.add(new Hobby("Football", 3, a2, a3));

        Random rand = new Random();
        Person person = people.get(rand.nextInt(people.size())); //get a random person from the list;

        Map<Person, List<Hobby>> hobbiesAndCountries = new HashMap<>();

        hobbiesAndCountries.put(person, hobbies);

        System.out.println("\n" + person.getName() + " can practice : ");
        for (Hobby h : hobbies) {
            System.out.println("\n" + h.getNameofHobby() + " in:");
            for (Address a : h.getHobbyPlace()) {
                System.out.println("- " + a.getCountry());
            }
            System.out.println();
        }
    }
}
