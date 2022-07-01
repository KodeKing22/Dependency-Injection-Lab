package org.example;

public class Dinosaur implements Attacker{
    //Instance variable (HAS A)
    public String name;
    public int attackPower;

    //Constructor
    public Dinosaur(String name,int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attack with their " + this.attackPower + " danger!");
    }
}
