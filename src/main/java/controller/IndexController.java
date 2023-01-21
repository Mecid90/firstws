package controller;

import model.PayInvoice;
import service.PayInvoiceService;
import service.PayInvoiceServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/index")
public class IndexController {

    private PayInvoiceService payInvoiceService = new PayInvoiceServiceImpl();

    @Path("/payInvoice")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public PayInvoice payInovice(PayInvoice payInvoice){

        payInvoiceService.printInvoice(payInvoice);

        return payInvoice;
    }


    @Path("/checkInvoice/invoiceRef={refNumber}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String checkInovice(@QueryParam("refNumber") String number){

        return "success";
    }
}
