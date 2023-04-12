package entities;

public class Course {
    private String name;
    private double price;

    public Course() {

    }

    public Course(String javaKursu, double price) {
        this.price = price;
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
