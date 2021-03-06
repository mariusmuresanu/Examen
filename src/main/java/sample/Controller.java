package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.DoubleStringConverter;
import sample.Domain.Invoice;
import sample.Domain.InvoiceDateFormatException;
import sample.Service.InvoiceService;
import sun.security.pkcs11.wrapper.CK_ATTRIBUTE;

public class Controller {
    public TableView tableViewInvoices;
    public TableColumn tableColumnId;
    public TableColumn tableColumnSum;
    public TableColumn tableColumnDescription;
    public TableColumn tableColumnDate;
    public TextField txtId;
    public TextField txtSum;
    public TextField txtDescription;
    public TextField txtDate;
    public Button btnAddCar;
    public TextField txtSumDay;
    public TextField txtSumResult;
    public Button btnKmForCar;
    public TableColumn tableColumnCarId;
    public TableColumn tableColumnModel;
    public TextField txtModel;
    public TableColumn tableColumnStartKm;
    public TextField txtStartKm;
    public TableColumn tableColumnPrice;
    public TextField txtPrice;
    public Button btnAddRent;
    public TextField txtCarId;
    public TextField txtDays;
    public TextField txtSumKm;
    public TextField txtCarIdKm;
    public TextField txtCarIdSum;
    public Button btnPriceForCar;

    private InvoiceService invoiceService;
    private ObservableList<Invoice> invoices = FXCollections.observableArrayList();

    public void btnAddCarClick(ActionEvent actionEvent) {
        try {
            String id = txtId.getText();
            String model = txtModel.getText();
            int startKm = Integer.parseInt(txtStartKm.getText());
            int price = Integer.parseInt(txtPrice.getText());

//            double sum = Double.parseDouble(txtSum.getText());
//            String description = txtDescription.getText();
//            String date = txtDate.getText();
//            invoiceService.add(id, model, startKm, price);

            txtId.clear();
            txtModel.clear();
            txtStartKm.clear();
            txtPrice.clear();

            invoices.clear();
            invoices.addAll(invoiceService.getAll());

        } catch (InvoiceDateFormatException idfe) {
            Common.showValidationError(idfe.getMessage());
        } catch (RuntimeException rex) {
            Common.showValidationError(rex.getMessage());
        }
    }

    public void btnAddRentClick(ActionEvent actionEvent) {
//        try {
//            String id = txtId.getText();
//            double sum = Double.parseDouble(txtSum.getText());
//            String description = txtDescription.getText();
//            String date = txtDate.getText();
//            invoiceService.add(id, sum, description, date);
//
//            txtId.clear();
//            txtSum.clear();
//            txtDescription.clear();
//            txtDate.clear();
//
//            invoices.clear();
//            invoices.addAll(invoiceService.getAll());
//
//        } catch (InvoiceDateFormatException idfe) {
//            Common.showValidationError(idfe.getMessage());
//        } catch (RuntimeException rex) {
//            Common.showValidationError(rex.getMessage());
//        }
    }

    public void setServices(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @FXML
    private void initialize() {

        Platform.runLater(() -> {
            invoices.addAll(invoiceService.getAll());
            tableViewInvoices.setItems(invoices);
        });
    }

    public void btnKmSumForCarClick(ActionEvent actionEvent) {
//        try {
//            String date = txtSumDay.getText();
//            double sum = invoiceService.getDaySum(date);
//            txtSumResult.setText(String.valueOf(sum));
//        } catch (InvoiceDateFormatException idfe) {
//            Common.showValidationError(idfe.getMessage());
//        }
    }

    public void btnKmSumForDayClick(ActionEvent actionEvent) {
//        try {
//            String date = txtSumDay.getText();
//            double sum = invoiceService.getDaySum(date);
//            txtSumResult.setText(String.valueOf(sum));
//        } catch (InvoiceDateFormatException idfe) {
//            Common.showValidationError(idfe.getMessage());
//        }
    }
}
