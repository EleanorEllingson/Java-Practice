package academy.ObjectOrientedProgramming.Classes1;

import java.util.Locale;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;

    public Car(int doors, int wheels, String model, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
