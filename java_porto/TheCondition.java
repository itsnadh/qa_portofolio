import java.util.Scanner;

public class TheCondition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered "+ number);
        int check = number%2;

        if(check==0){
            System.out.println(number +" is an even number");
        }
        else{
            System.out.println(number +" is an odd number");
        }

    }
}
