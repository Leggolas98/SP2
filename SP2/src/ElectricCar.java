public class ElectricCar extends ACar {

    int batteryCapacityKWh;
    int maxRange;
    int whPrKm;

    public ElectricCar(String registrationNumber, String carBrand, String model, int numberOfDoors, int batteryCapacityKWh, int maxRange) {
        super(registrationNumber, carBrand, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRange = maxRange;
    }
    int getBatteryCapacityKWh() { // returns the battery capacity in kilowatt-hours
        return batteryCapacityKWh;
    }

   int getMaxRangeKm() { // returns the maximum range in kilometres.
       return maxRange;
   }

   int getWhPrKm() { // returns the power consumption in watt-hours per driven kilometre
        whPrKm =  100 / batteryCapacityKWh;
        return whPrKm;
   }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        if (whPrKm >= 20 && whPrKm <= 50) {
            registrationFee = 330;

        } else if (whPrKm >= 15 && whPrKm <= 20) {
            registrationFee = 1050;

        } else if (whPrKm >= 10 && whPrKm <= 15) {
            registrationFee = 2340;

        } else if (whPrKm >= 5 && whPrKm <= 10) {
            registrationFee = 5500;

        } else if (whPrKm <= 5) {
            registrationFee = 10470;

        }

        return Integer.parseInt(registrationFee + " kr.");
    }
}
