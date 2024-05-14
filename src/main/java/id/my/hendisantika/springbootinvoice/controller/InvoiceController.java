package id.my.hendisantika.springbootinvoice.controller;

import id.my.hendisantika.springbootinvoice.entity.Invoice;
import id.my.hendisantika.springbootinvoice.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 08:08
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Controller
@RequestMapping("/invoice")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @GetMapping("/")
    public String showHomePage() {
        return "homePage";
    }

    @GetMapping("/register")
    public String showRegistration() {
        return "registerInvoicePage";
    }

    @PostMapping("/save")
    public String saveInvoice(
            @ModelAttribute Invoice invoice,
            Model model
    ) {
        invoiceService.saveInvoice(invoice);
        Long id = invoiceService.saveInvoice(invoice).getId();
        String message = "Record with id : '" + id + "' is saved successfully !";
        model.addAttribute("message", message);
        return "registerInvoicePage";
    }
}
