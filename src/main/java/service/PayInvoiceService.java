package service;

import model.PayInvoice;

import java.util.List;

public interface PayInvoiceService {


     public void printInvoice(PayInvoice payInvoice);

     public PayInvoice addInvoice(PayInvoice payInvoice);

     public List<PayInvoice> getAllInvoices();

     public PayInvoice getInvoice(Long id);
}
