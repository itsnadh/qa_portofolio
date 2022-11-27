import java.util.Scanner;

// - 5 jam pertama biayanya $1
// - Setelah itu, setiap jam akan di charge $0.5
// - Apabila sampai 24 jam, biayanya menjadi flat $15
// Contoh:
// - Apabila kita parkir selama 26 jam, perhitungan biayanya adalah sebagai
// berikut: 15+(2*0.5) = $16.0, karena sudah memenuhi 24 jam dan ada kelebihan 2
// jam
// - Apabila parkir selama 8 jam, perhitungannya sebagai berikut
// 5 + (0.5*3) = $6.5

public class ParkingPayment {
    public static void main(String[] args) {
        double parkingFee;
        int parkingTime, excess;
        int day = 0;

        System.out.println("==================PARKING FEE RULES==================");
        System.out.println("1-5 hour = $1/hour");
        System.out.println("after first 5 hour = $0.5/hour");
        System.out.println("24 hour = flat $15");
        System.out.println("==================PARKING CALCULATOR==================");
        System.out.println("Insert how many hour you park : ");
        Scanner input = new Scanner(System.in);
        parkingTime = input.nextInt();
        System.out.println("You park for : " + parkingTime + " hours");
        if (parkingTime <= 5) {
            parkingFee = 1 * parkingTime;
            System.out.println("You need to pay : $" + parkingFee);
        } else if (parkingTime > 5) {
            if (parkingTime < 24) {
                excess = parkingTime - 5;
                parkingFee = 5 + (excess * 0.5);
                System.out.println("You need to pay : $" + parkingFee);
            } else if (parkingTime >= 24) {
                if (parkingTime % 24 == 0) {
                    parkingFee = 15 * parkingTime / 24;
                    System.out.println("You need to pay : $" + parkingFee);
                } else {
                    while (parkingTime > 24) {
                        parkingTime -= 24;
                        day += 1;
                    }
                    excess = parkingTime;
                    parkingFee = (15 * day) + (0.5 * excess);
                    System.out.println("You need to pay : $" + parkingFee);
                }
            }
        }
    }
}