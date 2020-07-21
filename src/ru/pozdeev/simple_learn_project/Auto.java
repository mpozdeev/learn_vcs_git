package ru.pozdeev.simple_learn_project;

public class Auto {

    private CarManufacturer manufacturer;
    private String modelName;
    private BodyStyleCar bodyStyle;
    private DriveStyleCar driveType;

    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(CarManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BodyStyleCar getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(BodyStyleCar bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public DriveStyleCar getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveStyleCar driveType) {
        this.driveType = driveType;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "manufacturer=" + manufacturer +
                ", modelName='" + modelName + '\'' +
                ", bodyStyle=" + bodyStyle +
                ", driveType=" + driveType +
                '}';
    }
}
