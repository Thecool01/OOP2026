package lab2.problem5;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public void printAllPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void printPeopleWithPets() {
        for (Person person : people) {
            if (person.hasPet()) {
                System.out.println(person);
            }
        }
    }

    public void printPeopleWithoutPets() {
        for (Person person : people) {
            if (!person.hasPet()) {
                System.out.println(person);
            }
        }
    }


}
