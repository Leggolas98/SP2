import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();



    public void addCarToFleet(ACar car) {
        fleet.add(car);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Car car : fleet) {
            result.append("Car brand: ").append(car.getCarBrand()).append("\n");
            result.append("Model: ").append(car.getModel()).append("\n");
            result.append("Number of doors: ").append(car.getNumberOfDoors()).append("\n");
            result.append("Registration number: ").append(car.getRegistrationNumber()).append("\n");
            result.append("Registration fee: ").append(car.getRegistrationFee()).append("\n\n");
        }

        return result.toString();

    }

   public int getTotalRegistrationFee() {

       int totalRegistrationFee = 0;

       for (Car car : fleet) {
           totalRegistrationFee += car.getRegistrationFee();
       }

       return totalRegistrationFee;

   }

    }



