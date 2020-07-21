package ru.pozdeev.simple_learn_project;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setManufacturer(CarManufacturer.AUDI);
        auto1.setModelName("Q7");
        auto1.setBodyStyle(BodyStyleCar.SUV);
        auto1.setDriveType(DriveStyleCar.FullWD);

        System.out.println(auto1);
    }
}
