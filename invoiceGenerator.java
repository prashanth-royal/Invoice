public class invoiceGenerator {

    private static final double MINIMUM_FARE = 5;
    private static final int FARE_PER_TIME = 1;
    private double FARE_PER_KILOMETER = 10;
    Ride ride = new Ride();
    public double calculateFare(double distance, int time) {
        double totalDistance = distance * FARE_PER_KILOMETER + time * FARE_PER_TIME;
        return Math.max(totalDistance,MINIMUM_FARE);
    }
    public InvoiceSummary calculateFare(Ride[] rides)
    {
        double totalFare=0.0;
        for(Ride ride:rides)
        {
            double fare=ride.cabRide.calculateCostOfCabRide(ride);
            totalFare+=fare;
        }
        return new InvoiceSummary(rides.length,totalFare);
    }

    public void addRides(String userId, Ride[] ride)
    {
        System.out.println(userId);
        ride.add(userId,ride);
    }
}
