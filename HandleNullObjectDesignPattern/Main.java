package HandleNullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("The vehicle fuel tank capacity is: "+vehicle.getFuelTankCapacity());
        System.out.println("The vehicle seat capacity is: "+vehicle.getSeatCapaity());
    }
}
