package web.model;

public class Car {
    private String color;
    private String brand;
    private String engine;

    public Car(String color, String brand, String engine) {
        this.color = color;
        this.engine = engine;
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
