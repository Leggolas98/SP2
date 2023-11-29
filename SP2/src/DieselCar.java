public class DieselCar extends AFuelCar {

    boolean particleFilter;


    public DieselCar(String registrationNumber, String carBrand, String model, int numberOfDoors, boolean ParticleFilter) {
        super(registrationNumber, carBrand, model, numberOfDoors);
        this.particleFilter = ParticleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    String hasParticleFilter() {
        if (particleFilter == true) {

            return "The car has a particle filter";

        } else {

            return "The car does not have a particle filter";
        }
    }

    @Override
    public int getRegistrationFee() {

        int registrationFee = 0;

        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            registrationFee = 130;

        } else if (kmPrLitre >= 15 && kmPrLitre <= 20) {
            registrationFee = 1390;

        } else if (kmPrLitre >= 10 && kmPrLitre() <= 15) {
            registrationFee = 1850;

        } else if (kmPrLitre >= 5 && kmPrLitre <= 10) {
            registrationFee = 2770;

        } else if (kmPrLitre <= 5) {
            registrationFee = 15260;

        }

        if (particleFilter == true) {
            registrationFee = registrationFee + 1000;
        }

        return registrationFee;

    }
}
