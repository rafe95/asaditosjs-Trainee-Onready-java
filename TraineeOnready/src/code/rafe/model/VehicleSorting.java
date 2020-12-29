package code.rafe.model;

import java.util.Comparator;
import java.util.List;

public class VehicleSorting {

    public enum Sort {
        ASC("ASC"), DESC("DESC");
        public final String dir;

        Sort(String dir) {
            this.dir = dir;
        }
    }

    public static void sortByPrice(List<? extends Vehicle> vehicles, Sort sort) {
        var comparator = Comparator.comparing(Vehicle::getPrice);
        if (sort == Sort.DESC) {
            comparator = comparator.reversed();
        }
        vehicles.sort(comparator);
    }

    public static Vehicle findModelContainingLetter(List<? extends Vehicle> cars, String letter) {
        return cars.stream().filter(vehicle -> vehicle.getModel().contains(letter)).findFirst().get();
    }
}
