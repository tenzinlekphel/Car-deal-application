package car_dealership;

public class Employee {
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
    {
        if(finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }
    }

    public void runCreditHistory(Customer cust, double loanAmount) {
        System.out.println("Run credit history for customer");
        System.out.println("Customer has benn approved the car");
    }

    public void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Customer had purchased the vehicle:" + vehicle + " for the price " + vehicle.getPrice());
    }

}
