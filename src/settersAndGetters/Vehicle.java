package settersAndGetters;

public class Vehicle {
    private String model;
    private int year;
    private int door;
    private int wheel;
    private String color;

    public Vehicle(String model, int year, int door, int wheel, String color) {
        this.model = model;
        this.year = year;
        this.door = door;
        this.wheel = wheel;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
