package sample.Domain;

public class Car extends Entity{

    private String model;
    private int startKm, price;


    public Car(String id, String model, int startKm, int price) {
        super(id);
        this.model = model;
        this.startKm = startKm;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStartKm() {
        return startKm;
    }

    public void setStartKm(int startKm) {
        this.startKm = startKm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", startKm=" + startKm +
                ", price=" + price +
                '}';
    }
}
