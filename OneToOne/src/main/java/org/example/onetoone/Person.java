package org.example.onetoone;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id")
    private Passport passport;

    public Person() {}

    public Person(String name, Passport passport) {
        this.name = name;
        setPassport(passport);
    }

    public int getId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
        if (passport != null) {
            passport.setPerson(this);
        }
    }
}
