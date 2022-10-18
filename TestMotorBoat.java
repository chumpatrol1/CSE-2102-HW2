
public class MotorBoat {

    private Double fuelCapacity;
    private Double fuelAmount;
    private Double maxSpeed;
    private Double curSpeed;
    private Double motorEfficiency;
    private Double distanceTraveled;

    public MotorBoat(Double initialFuelCapacity, Double initialFuelAmount, Double initialMaxSpeed,
            Double initialCurSpeed, Double initialMotorEfficiency, Double initialDistanceTraveled) {

        fuelCapacity = initialFuelCapacity;
        fuelAmount = initialFuelAmount;
        maxSpeed = initialMaxSpeed;
        curSpeed = initialCurSpeed;
        motorEfficiency = initialMotorEfficiency;
        distanceTraveled = initialDistanceTraveled;

    }

    public void changeSpeed(Double newSpeed) {

        curSpeed = newSpeed;
    }

    public void refuel(Double amountToAdd) {
        fuelAmount += amountToAdd;
    }

    public double curFuelTotal() {

        return fuelAmount;
    }

    public double distanceTraveledCheck() {
        return distanceTraveled;
    }

    public void operateBoat(double timeOperated) {

        double fuelBurn = (curSpeed * curSpeed * motorEfficiency * timeOperated) / 100;

        double distanceFromTrip = curSpeed * timeOperated;

        distanceTraveled += distanceFromTrip;

        fuelAmount -= fuelBurn;

        if (fuelAmount <= 0) {
            System.out.print("Error boat failed to operate");
            System.exit(0);

        }

    }

}
