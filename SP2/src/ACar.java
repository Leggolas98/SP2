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
        return registrationNumber;
    }

    @Override
    public String getCarBrand() {
        return carBrand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return registrationNumber + carBrand + model + numberOfDoors;
    }
}
