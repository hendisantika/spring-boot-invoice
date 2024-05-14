package id.my.hendisantika.springbootinvoice.service;

import id.my.hendisantika.springbootinvoice.entity.Invoice;
import id.my.hendisantika.springbootinvoice.exception.InvoiceNotFoundException;
import id.my.hendisantika.springbootinvoice.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 08:06
 * To change this template use File | Settings | File Templates.
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    public Invoice getInvoiceById(Long id) {
        Optional<Invoice> opt = invoiceRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new InvoiceNotFoundException("Invoice with Id : " + id + " Not Found");
        }
    }

    public void deleteInvoiceById(Long id) {
        invoiceRepository.delete(getInvoiceById(id));
    }

    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }
}
