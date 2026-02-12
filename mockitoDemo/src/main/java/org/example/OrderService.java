package org.example;

public class OrderService {
    private PaymentService paymentService;

    // Constructor Injection
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // Method to test
    public String placeOrder(double amount){
        System.out.println("[OrderService] Placing order...");
        boolean paymentSuccess = paymentService.processPayment(amount);

        if(paymentSuccess){
            return "ORDER PLACED";
        }else{
            return "PAYMENT FAILED";
        }
    }


    public boolean validateAndPlaceOrder(double amount){
        if(amount <= 0){
            return  false;
        }
        boolean paymentSuccess = paymentService.processPayment(amount);
        return paymentSuccess;
    }
}
