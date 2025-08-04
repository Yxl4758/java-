package _08Test;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Bank instance;
    private final Map<String,Customer> customers;
    private Bank() {
        customers = new HashMap<>();
    }
    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(),customer);
    }
    public Customer getCustomer(String id) {
        return customers.get(id);
    }
}
