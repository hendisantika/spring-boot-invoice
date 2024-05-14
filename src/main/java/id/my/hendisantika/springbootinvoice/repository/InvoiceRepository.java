package id.my.hendisantika.springbootinvoice.repository;

import id.my.hendisantika.springbootinvoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-invoice
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 5/14/24
 * Time: 08:05
 * To change this template use File | Settings | File Templates.
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
