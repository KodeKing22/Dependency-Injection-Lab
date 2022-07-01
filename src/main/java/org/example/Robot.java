package org.example;

public class Robot {

    //Instance variables(HAS A)
    public String name;
    public String weaponName;
    public int attackPower;

    //Constructor
    public Robot() {
        this.name ="Brutus";
        this.attackPower = 50;
        this.weaponName = "Light Gun";

    //Methods (CAN DO)
    public void Attack(){
            System.out.println(this.name + "attack with their" + this.weaponName + "for" + this.attackPower + "danger!");
        }
    }
}
