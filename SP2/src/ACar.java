public abstract class ACar implements Car {

    String registrationNumber;

    String carBrand;

    String model;

    int numberOfDoors;

    public ACar(String registrationNumber, String carBrand, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.carBrand = carBrand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getCarBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    @Override
    public String toString() {
        return registrationNumber + carBrand + model + numberOfDoors;
    }
}
