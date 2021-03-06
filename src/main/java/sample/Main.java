package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Domain.IValidator;
import sample.Domain.Invoice;
import sample.Domain.InvoiceValidator;
import sample.Repository.FileRepository;
import sample.Repository.IRepository;
import sample.Service.InvoiceService;

import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample.fxml"));
        Parent root = fxmlLoader.load();

        Controller controller =  fxmlLoader.getController();

        IValidator<Invoice> invoiceValidator = new InvoiceValidator();
        IRepository<Invoice> invoiceIRepository= new FileRepository<>(invoiceValidator, "invoices.json", Invoice[].class);

        InvoiceService invoiceService = new InvoiceService(invoiceIRepository);
        invoiceService.add("1", "Audi", 1000, 100);
        invoiceService.add("2", "Volvo", 2000, 200);
        invoiceService.add("3", "Opel", 3000, 300);

        controller.setServices(invoiceService);

        primaryStage.setTitle("Rents manager");
        primaryStage.setScene(new Scene(root, 650, 500));

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
