package org.example;

public class Main {

    public static void main(String[] args) {
        Lightsaber lightsaber = new Lightsaber();
        Robot robot_one = new Robot(lightsaber);
        robot_one.Attack();
}}