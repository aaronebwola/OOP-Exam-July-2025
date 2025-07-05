import java.util.Random;

public class PassengerSource {
    private final Company company;
    private final Random random;
    
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }
    
    public boolean requestPickup() {
        // Create new passenger
        Passenger passenger = new Passenger();
        
        // Generate random pickup location (0-100 range)
        Location pickupLocation = new Location(
                random.nextInt(101),
                random.nextInt(101));
        
        // Generate random destination location (0-100 range)
        Location destinationLocation = new Location(
                random.nextInt(101),
                random.nextInt(101));
        
        // Set passenger locations
        passenger.setPickupLocation(pickupLocation);
        passenger.setDestinationLocation(destinationLocation);
        
        // Use company to schedule vehicle
        return company.scheduleVehicle(passenger);
    }
    
    // Add main method for Maven execution
    public static void main(String[] args) {
        Company company = new Company();
        PassengerSource source = new PassengerSource(company);
        
        // Test the requestPickup method
        System.out.println("Testing passenger pickup requests:");
        for (int i = 1; i <= 3; i++) {
            boolean success = source.requestPickup();
            System.out.println("Request " + i + ": " + (success ? "Scheduled" : "Failed"));
        }
    }
}

// Supporting classes for completeness
class Company {
    public boolean scheduleVehicle(Passenger passenger) {
        // Implementation would check for available vehicles
        // Returns true if vehicle scheduled, false if no vehicles available
        System.out.println("Scheduling vehicle for pickup at (" + 
                          passenger.getPickupLocation().getX() + ", " + 
                          passenger.getPickupLocation().getY() + 
                          ") to destination (" + 
                          passenger.getDestinationLocation().getX() + ", " + 
                          passenger.getDestinationLocation().getY() + ")");
        return true; // Placeholder
    }

    void removeAllVehicles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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