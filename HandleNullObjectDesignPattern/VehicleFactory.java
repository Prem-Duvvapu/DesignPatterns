public class VehicleFactory {
    public static Vehicle getVehicleObject(String typeOfVehicle) {
        if (typeOfVehicle.equals("Car"))
            return new Car();

        return new NullVehicle();
    }
}
