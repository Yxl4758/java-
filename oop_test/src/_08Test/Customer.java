package _08Test;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String id;
    private final String name;
    private final List<Account> accounts;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
    public Account findAccount(String accountNumber){
        for (Account account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }
}
