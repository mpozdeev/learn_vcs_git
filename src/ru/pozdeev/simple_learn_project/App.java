package ru.pozdeev.simple_learn_project;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto1.setManufacturer(CarManufacturer.AUDI);
        auto1.setModelName("Q7");
        auto1.setBodyStyle(BodyStyleCar.SUV);
        auto1.setDriveType(DriveStyleCar.FullWD);

        auto2.setManufacturer(CarManufacturer.BMW);
        auto2.setModelName("M3");
        auto2.setBodyStyle(BodyStyleCar.SEDAN);
        auto2.setDriveType(DriveStyleCar.RWD);


        auto3.setManufacturer(CarManufacturer.TOYOTA);
        auto3.setModelName("Celica");
        auto3.setBodyStyle(BodyStyleCar.SEDAN);
        auto3.setDriveType(DriveStyleCar.RWD);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
    }
}
