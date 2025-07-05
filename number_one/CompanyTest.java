public class CompanyTest {
    private Company company;
    private Passenger passenger;

    public void setUp() {
        company = new Company();
        passenger = new Passenger();
        passenger.setPickupLocation(new Location(10, 20));
        passenger.setDestinationLocation(new Location(50, 60));
    }

    public void testScheduleVehicleWithAvailableVehicle() {
        setUp();
        // Test when vehicle is available
        boolean result = company.scheduleVehicle(passenger);
        assert result : "Should return true when vehicle is available";
        System.out.println("Test 1 passed: Vehicle scheduled successfully");
    }

    public void testScheduleVehicleWithNoAvailableVehicle() {
        setUp();
        // Test when no vehicles are available
        Company emptyCompany = new Company();
        emptyCompany.removeAllVehicles(); // Hypothetical
        boolean result = emptyCompany.scheduleVehicle(passenger);
        assert !result : "Should return false when no vehicles available";
        System.out.println("Test 2 passed: No vehicle available scenario handled");
    }

    public static void main(String[] args) {
        CompanyTest test = new CompanyTest();
        test.testScheduleVehicleWithAvailableVehicle();
        test.testScheduleVehicleWithNoAvailableVehicle();
        System.out.println("All tests completed");
    }
}

class Company {
    private boolean hasVehicles = true;

    public boolean scheduleVehicle(Passenger passenger) {
        return hasVehicles;
    }

    public void removeAllVehicles() {
        this.hasVehicles = false;
    }
}

class Location {
    private final int x;
    private final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Passenger {
    private Location pickupLocation;
    private Location destinationLocation;

    public void setPickupLocation(Location location) {
        this.pickupLocation = location;
    }

    public void setDestinationLocation(Location location) {
        this.destinationLocation = location;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }
}
