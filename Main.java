
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus busObj = new Bus();
        Scanner input = new Scanner(System.in);

        System.out.println("How many passangers are waiting? ");
        try {
            busObj.setNumberOfPassangers(input.nextInt());
        } catch (Exception e) {
            System.out.println("Enter intergers only");
        }
        input.close();
        busObj.remainingSeats();
    }
}