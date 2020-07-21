package ru.pozdeev.simple_learn_project;

public class Auto {

    private String modelName;
    private String bodyStyle;
    private String driveType;

    public Auto() {
    }

    public Auto(String modelName, String bodyStyle, String driveType) {
        this.modelName = modelName;
        this.bodyStyle = bodyStyle;
        this.driveType = driveType;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelName='" + modelName + '\'' +
                ", bodyStyle='" + bodyStyle + '\'' +
                ", driveType='" + driveType + '\'' +
                '}';
    }
}
