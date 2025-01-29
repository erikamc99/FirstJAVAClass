package dev.erica.my_first_class;

import dev.erica.my_first_class.Person.Person;

public final class App {
    private App() {
    }

    /**
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person erika = new Person("Erica", "Montesinos", 25, 12345678);

        System.out.println("I'm " + erika.getName() + " " + erika.getSurname() + " and I'm " + erika.getAge() + " years old. My ID number is " + erika.getNumID());
    }
}
