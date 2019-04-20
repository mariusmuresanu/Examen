package sample.Service;

import sample.Domain.Invoice;
import sample.Domain.InvoiceValidator;
import sample.Repository.IRepository;

import java.util.List;

public class InvoiceService {

    private IRepository<Invoice> repository;

    /**
     * Constructs a service.
     * @param repository the backing repository.
     */
    public InvoiceService(IRepository<Invoice> repository) {
        this.repository = repository;
    }

    /**
     * Adds an invoice with the given fields.
     * @param id the id - must be unique.
     * @param model the sum.
     * @param startKm the description.
     * @param price the date - must be in dd.mm.yyyy format.
     */
    public void add(String id, String model, int startKm, int price) {
        Invoice invoice = new Invoice(id, model, startKm, price);
        repository.upsert(invoice);
    }

    /**
     * Gets the sum of all invoices in a given day.
     * @param startKm the given date.
     * @return the sum of all invoices in date.
     */
    public double getDaySum(int startKm) {
        InvoiceValidator validator = new InvoiceValidator();
        Invoice dummy = new Invoice("1", "Audi", 1, 100);
        validator.validate(dummy);

        double sum = 0;
        for (Invoice invoice : repository.getAll()) {
            if (invoice.getStartKm()==(startKm)) {
                sum += invoice.getStartKm();
            }
        }
        return sum;
    }

    /**
     * Gets a list of all invoices.
     * @return a list of all invoices.
     */
    public List<Invoice> getAll() {
        return repository.getAll();
    }
}
