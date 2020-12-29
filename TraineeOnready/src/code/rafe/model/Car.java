package code.rafe.model;

public class Car extends Vehicle {

    private int doors;

    public Car(String brand, String model, int doors, double price) {
        super(brand, model, price);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s // Modelo: %s // Puertas: %d // Precio: $%s", super.getBrand(), super.getModel(), doors, String.format("%,.2f", super.getPrice()));
    }
}
