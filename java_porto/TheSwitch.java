import java.util.Scanner;

public class TheSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Select a day by pick one number from 1-7: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("You pick Monday");
                break;
            case 2:
                System.out.println("Here is Tuesday for you");
                break;
            case 3:
                System.out.println("OMG! Wednesday!");
                break;
            case 4:
                System.out.println("Gloomy Thursday");
                break;
            case 5:
                System.out.println("TGIFFriday~");
                break;
            case 6:
                System.out.println("Satdate, anyone?");
                break;
            case 7:
                System.out.println("Sunday = Restday");
                break;
            default:
                System.out.println("heeey, I say pick number from 1 to 7, you kid!");
        }
    }
}
