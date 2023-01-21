package service;


import model.PayInvoice;


public class PayInvoiceServiceImpl implements PayInvoiceService {

//    @Override
//    public String isUserAutheticated(String name, String password) {
//        String credentials = name +":" +password;
//
//        try{
//            credentials=Base64.getEncoder().encodeToString(credentials.getBytes());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return credentials;
//    }



    @Override
    public void printInvoice(PayInvoice payInvoice) {
        System.out.println("id: " + payInvoice.getId() + " amount:"
                + payInvoice.getAmount() + " currency:" + payInvoice.getCurrency() + " transactionId:"
                + payInvoice.getTransactionId() + " agent:"
                + payInvoice.getAgent() + " pmbm:"
                + payInvoice.getPbmb());
    }
}
