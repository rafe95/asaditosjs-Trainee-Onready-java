package code.rafe.model;

public class Motorcycle extends Vehicle {

    private String displacement;

    public Motorcycle(String brand, String model, String displacement, double price) {
        super(brand, model, price);
        this.displacement = displacement;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s // Modelo: %s // Cilindrada: %s // Precio: $%s", super.getBrand(), super.getModel(), displacement, String.format("%,.2f", super.getPrice()));
    }
}
