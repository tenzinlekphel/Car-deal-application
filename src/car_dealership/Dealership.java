package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cus1 = new Customer();
        cus1.setName("Chokrab");
        cus1.setAddress("Bern");
        cus1.setCashOnHand(232333);

        Vehicle vehicle = new Vehicle();

        Employee emp = new Employee();


        cus1.purchaseCar(vehicle, emp, false);

        /**
         * handleCustomer( Customer cut, boolean finance, Vehicle vehicle)
         *
         *
         *
         */
    }
}
