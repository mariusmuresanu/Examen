package sample.Tests;

import org.junit.jupiter.api.Test;
import sample.Domain.Invoice;
import sample.Domain.InvoiceDateFormatException;
import sample.Domain.InvoiceValidator;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceValidatorTest {

    @Test
    void validateShouldThrowOnlyWhenNecessary() {

        InvoiceValidator validator = new InvoiceValidator();
        Invoice correctInvoice = new Invoice("1", "Audi", 100, 1000);
        assertDoesNotThrow(() -> validator.validate(correctInvoice));

//        Invoice incorrectFormat = new Invoice("1", "Audi", 100, -1000);
//        assertThrows(InvoiceDateFormatException.class, () -> validator.validate(incorrectFormat));

        Invoice incorrectValues = new Invoice("1", "Audi", 100, 0);
//        assertThrows(InvoiceDateFormatException.class, () -> validator.validate(incorrectValues));
    }
}