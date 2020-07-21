package ru.pozdeev.simple_learn_project;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setModelName("Audi Q7");
        auto1.setBodyStyle("SUV");
        auto1.setDriveType("4WD");


        System.out.println(auto1);
    }
}
