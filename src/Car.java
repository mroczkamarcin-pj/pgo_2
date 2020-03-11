import java.util.Scanner;

public class Car {
    String color;
    String brand;
    int capacity;


    public Car(String color, String brand, int capacity) {
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void isHighSpeed() {

        if (capacity >= 2) {
            System.out.println("the engine is high-speed");
        } else {
            System.out.println("the engine is low-speed");
        }
    }

    public void modifyCapacity() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the new capacity");
        int newCapacity = scan.nextInt();
        capacity = newCapacity;
        System.out.println("great, modified capacity equals " + capacity);


    }


}


