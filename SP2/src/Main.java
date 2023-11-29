import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        GasCar gasCar = new GasCar("R8 2023", "Audi", "R8 coupé V10 Performance", 2);

        DieselCar dieselCar = new DieselCar("A5 2023", "Audi", "A5 Cabriolet", 2, true);

        ElectricCar electricCar = new ElectricCar("Q8 2023", "Audi", "Q8 e-tron", 4, 106, 576);

        fleet.addCarToFleet(gasCar);
        fleet.addCarToFleet(dieselCar);
        fleet.addCarToFleet(electricCar);

        System.out.println("\n" + "The collection of cars consists of: " + "\n\n" + fleet);
        System.out.println("The total registration fee is:" + fleet.getTotalRegistrationFee() + " kr.");
    }


}
