package org.CodeForPizza;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON")
@Inheritance (strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "PERSON_ID")
    private int personID;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;

    public Person(int personID, String firstName, String lastName) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }


    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
