import java.util.Scanner;

public class Telephone {

    String brand;
    int screenResolution;
    float number;


    public Telephone(String brand, int screenResolution, int number) {
        this.brand = brand;
        this.screenResolution = screenResolution;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public static String sendMessage (float number){


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the message");
        String message = scan.nextLine();

        System.out.println("Sending the message " +message+ " to number "+number);

        return message;

    }

}
