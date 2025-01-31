package dev.erica.my_first_class.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Test del contructor de persona")
    public void testPerson() {
        Person person = new Person("John", "Doe", 30, 12345);
        assertEquals("John", person.getName());
        assertEquals("Doe", person.getSurname());
        assertEquals(30, person.getAge());
        assertEquals(12345, person.getNumID());
    }
    @Test
    @DisplayName("Test para establecer un nombre")
    public void testSetName() {
        Person person = new Person("John", "Doe", 30, 12345);
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }
    @Test
    @DisplayName("Test para establecer un apellido")
    public void testSetSurname() {
        Person person = new Person("John", "Doe", 30, 12345);
        person.setSurname("Smith");
        assertEquals("Smith", person.getSurname());
    }
    @Test
    @DisplayName("Test para establecer una edad")
    public void testSetAge() {
        Person person = new Person("John", "Doe", 30, 12345);
        person.setAge(35);
        assertEquals(35, person.getAge());
    }
    @Test
    @DisplayName("Test para establecer un número de ID")
    public void testSetNumID() {
        Person person = new Person("John", "Doe", 30, 12345);
        person.setNumID(54321);
        assertEquals(54321, person.getNumID());
    }
}
