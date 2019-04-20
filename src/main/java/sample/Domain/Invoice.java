package sample.Domain;

public class Invoice extends Entity {

    private String model;
    private int startKm, price;

    public Invoice(String id, String model, int startKm, int price) {
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
        return "Invoice{" +
                "model='" + model + '\'' +
                ", startKm=" + startKm +
                ", price=" + price +
                '}';
    }

    //    public Invoice(String id, double sum, String description, String date) {
//        super(id);
//        this.sum = sum;
//        this.description = description;
//        this.date = date;
//    }
//
//    public double getSum() {
//        return sum;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    @Override
//    public String toString() {
//        return "Invoice{" +
//                "sum=" + sum +
//                ", description='" + description + '\'' +
//                ", date='" + date + '\'' +
//                '}';
//    }
}
