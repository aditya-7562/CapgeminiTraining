package org.example.onetoone;

import jakarta.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passportId;

    private String passportNumber;
    private String country;

    @OneToOne(mappedBy = "passport")
    private Person person;

    public Passport() {}

    public Passport(String passportNumber, String country) {
        this.passportNumber = passportNumber;
        this.country = country;
    }

    public int getPassportId() {
        return passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getCountry() {
        return country;
    }

    public Person getPerson() {
        return person;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
