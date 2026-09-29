import java.util.Scanner;

public class VehicleDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read speed
        System.out.print("Enter speed of the vehicle (km/h): ");
        double speed = sc.nextDouble();

        // Read time
        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        // Calculate distance
        double distance = speed * time;

        // Display results
        System.out.println("\nSpeed: " + speed + " km/h");
        System.out.println("Time: " + time + " hours");
        System.out.println("Distance traveled: " + distance + " km");

        sc.close();
    }
}