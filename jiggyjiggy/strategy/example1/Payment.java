package strategy.example1;

import strategy.example1.billing.BillingStrategy;
import strategy.example1.billing.CustomerBill;

public class Payment {
    public static void main(String[] args) {
        BillingStrategy normalStrategy = BillingStrategy.NORMAL;
        BillingStrategy happyHourStrategy = BillingStrategy.HAPPY_HOUR;

        CustomerBill firstCustomer = new CustomerBill(normalStrategy);

        firstCustomer.add(100, 1);

        // Start Happy Hour
        firstCustomer.setStrategy(happyHourStrategy);
        firstCustomer.add(100, 2);

        CustomerBill secondCustomer = new CustomerBill(happyHourStrategy);
        secondCustomer.add(80, 1);

        firstCustomer.print();

        // End Happy Hour
        secondCustomer.setStrategy(normalStrategy);
        secondCustomer.add(130, 2);
        secondCustomer.add(259, 1);
        secondCustomer.print();
    }
}
