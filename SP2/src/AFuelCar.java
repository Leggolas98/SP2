public abstract class AFuelCar extends ACar {

    int kmPrLitre;

    public AFuelCar(String registrationNumber, String carBrand, String model, int numberOfDoors) {
        super(registrationNumber, carBrand, model, numberOfDoors);
    }

    abstract String getFuelType(); //Should return "Gas" or "Diesel"

    int kmPrLitre() // Should return how many kilometres the car can drive on 1 litre of fuel
    {
        return kmPrLitre;
    }
}
