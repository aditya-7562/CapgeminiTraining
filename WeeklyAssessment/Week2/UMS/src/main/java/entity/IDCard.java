package entity;

import jakarta.persistence.*;

@Entity
public class IDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cardNumber;

    @OneToOne(mappedBy = "idCard")
    private Student student;

    public IDCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public IDCard() {
    }

    public String getCardNumber() {
        return cardNumber;
    }
}