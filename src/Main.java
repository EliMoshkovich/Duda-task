import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(4, 20));
        vehicles.add(new Car(4, 0.4f));
        vehicles.add(new Motorcycle(2, 5));
        vehicles.add(new Motorcycle(2, 0.8f));

        vehicles.forEach(vehicle -> System.out.println(vehicle));
        System.out.println("---------------------------------------------");
        vehicles = Main.sortVehicle(vehicles);
        vehicles.forEach(vehicle -> System.out.println(vehicle));
    }

    private static ArrayList sortVehicle(ArrayList<Vehicle> vehicles){
        ArrayList<Vehicle> vehicles_fuel = new ArrayList<>();
        ArrayList<Vehicle> vehicles_electric = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getEngineType() == Engine.EngineType.Fuel){
                vehicles_fuel.add(vehicle);
            }
            else if(vehicle.getEngineType() == Engine.EngineType.Electric){
                vehicles_electric.add(vehicle);
            }
        }
        Collections.sort(vehicles_fuel);
        Collections.sort(vehicles_electric);

        ArrayList<Vehicle> vehicles_sorted = new ArrayList<>();
        vehicles_fuel.forEach(vehicle -> vehicles_sorted.add(vehicle));
        vehicles_electric.forEach(vehicle -> vehicles_sorted.add(vehicle));
        return vehicles_sorted;
    }
}
