package code.rafe;

import code.rafe.model.Car;
import code.rafe.model.Motorcycle;
import code.rafe.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static code.rafe.model.VehicleSorting.*;

public class Main {

    public static void main(String[] args) {
        var vehicles = getVehicles();
        analyzeVehicles(vehicles);
    }

    public static List<Vehicle> getVehicles() {
        return new ArrayList<>(Arrays.asList(
                new Car("Peugeot", "206", 4, 200000),
                new Motorcycle("Honda", "Titan", "125cc", 60000),
                new Car("Peugeot", "208", 5, 250000),
                new Motorcycle("Yamaha", "YBR", "160cc", 80500.50)));
    }

    public static void analyzeVehicles(List<Vehicle> vehicles) {
        String separator = "=============================";
        vehicles.forEach(System.out::println);
        System.out.println(separator);
        sortByPrice(vehicles, Sort.ASC);
        var expensiveVehicle = vehicles.get(vehicles.size() - 1);
        var cheaperVehicle = vehicles.get(0);
        var yVehicle = findModelContainingLetter(vehicles, "Y");
        System.out.println(String.format("Vehículo más caro: %s %s", expensiveVehicle.getBrand(), expensiveVehicle.getModel()));
        System.out.println(String.format("Vehículo más barato: %s %s", cheaperVehicle.getBrand(), cheaperVehicle.getModel()));
        System.out.println(String.format("Vehículo que contiene en el modelo la letra ‘Y’: %s %s $%s", yVehicle.getBrand(), yVehicle.getModel(), String.format("%,.2f", yVehicle.getPrice())));
        System.out.println(separator);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        sortByPrice(vehicles, Sort.DESC);
        vehicles.forEach(e ->
                System.out.println(String.format("%s %s", e.getBrand(), e.getModel()))
        );
    }
}
