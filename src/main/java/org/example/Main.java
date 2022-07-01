package org.example;

public class Main {

    public static void main(String[] args) {
        Weapon lightsaber = new Lightsaber();
        Attacker robot_one = new Robot(lightsaber);
        robot_one.Attack();
        Attacker dinosaur_one = new Dinosaur("Jack", 35);
}}