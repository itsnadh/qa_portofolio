// B. Inheritance and Polymorphism challenge:
// a. Buatlah Class dengan nama Vehicle yang merepresentasikan
// model kendaraan secara general (memiliki roda, dapat bergerak
// maju, dapat berbelok, dll)
// b. Buatlah Class Car yang meng inherit attribute dan method dari
// Vehicle.
// c. Buatlah attribute dan method pada Class Car yang
// merepresentasikan mobil secara spesifik (memiliki 4 ban, kapasitas
// tangki, pindah transmisi dll)
// d. Buatlah 3 sample Class berbeda yang meng inherit Class Car, misal
// Class Honda Jazz, Toyota Fortuner, Suzuki Katana
// e. Tambahkan atribut dan method spesifik untuk masing masing
// child Class dan lakukan override pada method method yang perlu
// dirubah di Child Class

class Vehicle {
    int roda, kapasitas_tangki;

    public void Maju() {
        System.out.println("Maju");
    }

    public void Mundur() {
        System.out.println("Mundur");
    }

    public void Belok() {
        System.out.println("Belok");
    }

    public void Klakson() {
        System.out.println("Klakson Vehicle : Klakson");
    }

}

class Car extends Vehicle {
    int roda = 4;
    int kapasitas_tangki = 20;

    public void Klakson() {
        System.out.println("Klakson car : Tin Tin");
    }

    public void PindahTransmisi() {
        System.out.println("Pindah Transmisi");
    }

    public void Manuver() {
        System.out.println("Manuver");
    }
}

class HondaJazz extends Car {
    int kapasitas_tangki = 50;
    String brand = "Honda";
    String tipe = "Jazz";

    public void Klakson() {
        System.out.println("Klakson jazz : Piu Piu");
    }

    public void PlayMusic() {
        System.out.println("Jazz plays jazz music");
    }
}

class ToyotaFortuner extends Car {
    int kapasitas_tangki = 60;
    String brand = "Toyota";
    String tipe = "Fortuner";

    public void Klakson() {
        System.out.println("Klakson car : Tetoot Tetoot");
    }

    public void SelfDrive() {
        System.out.println("Self drive mode activate");
    }
}

class SuzukiKatana extends Car {
    int kapasitas_tangki = 70;
    String brand = "Suzuki";
    String tipe = "Katana";

    public void Klakson() {
        System.out.println("Klakson katana : Brum Brum");
    }

    public void Robot() {
        System.out.println("Change to robot");
    }
}

class RideVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        SuzukiKatana katana = new SuzukiKatana();
        HondaJazz jazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();

        // vehicle
        System.out.println("=====VEHICLE=====");
        vehicle.Maju();
        vehicle.Mundur();
        vehicle.Belok();
        vehicle.Klakson();

        // car
        System.out.println("=====CAR=====");
        car.Maju();
        car.Mundur();
        car.Belok();
        car.Manuver();
        car.PindahTransmisi();
        car.Klakson();
        System.out.println("roda car = " + car.roda);
        System.out.println("kapasitas tangki car = " + car.kapasitas_tangki);

        // jazz
        System.out.println("=====HONDA JAZZ=====");
        jazz.Maju();
        jazz.Mundur();
        jazz.Belok();
        jazz.Manuver();
        jazz.PindahTransmisi();
        jazz.Klakson();
        jazz.PlayMusic();
        System.out.println("roda jazz = " + katana.roda);
        System.out.println("kapasitas tangki jazz = " + jazz.kapasitas_tangki);
        System.out.println("tipe jazz = " + jazz.tipe);
        System.out.println("brand jazz = " + jazz.brand);

        // fortuner
        System.out.println("=====TOYOTA FORTUNER=====");
        fortuner.Maju();
        fortuner.Mundur();
        fortuner.Belok();
        fortuner.Manuver();
        fortuner.PindahTransmisi();
        fortuner.Klakson();
        fortuner.SelfDrive();
        System.out.println("roda fortuner = " + katana.roda);
        System.out.println("kapasitas tangki fortuner = " + fortuner.kapasitas_tangki);
        System.out.println("tipe fortuner = " + fortuner.tipe);
        System.out.println("brand fortuner = " + fortuner.brand);

        // katana
        System.out.println("=====SUZUKI KATANA=====");
        katana.Maju();
        katana.Mundur();
        katana.Belok();
        katana.Manuver();
        katana.PindahTransmisi();
        katana.Klakson();
        katana.Robot();
        System.out.println("roda katana = " + katana.roda);
        System.out.println("kapasitas tangki katana = " + katana.kapasitas_tangki);
        System.out.println("tipe katana = " + katana.tipe);
        System.out.println("katana brand = " + katana.brand);

    }
}
