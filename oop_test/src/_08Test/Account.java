package _08Test;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private final String accountNumber;
    private double balance;
    private AccountStatus status;
    private final Customer owner;
    private final List<Transaction> transactions;

    public Account(String accountNumber, Customer owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.transactions = new ArrayList<>();
        this.balance = balance;
        this.status = AccountStatus.ACTIVE;
    }

    public void deposit(double amount) throws _08Test.AccountException {
        if (amount <= 0) {
            throw new _08Test.AccountException("存款金额必须大于0");
        }
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT,amount,"存款"));
    }

    public abstract void withdraw(double amount) throws _08Test.AccountException;

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(Account targetAccount, double amount) throws _08Test.AccountException {
        if (this == targetAccount) {
            throw new _08Test.AccountException("不能转账给自己");
        }
        if (this.status != AccountStatus.ACTIVE || targetAccount.status != AccountStatus.ACTIVE) {
            throw new _08Test.AccountException("账户状态异常");
        }
        this.withdraw(amount);  //从当前账户取款
        targetAccount.deposit(amount);  //存入目标账户
        //添加转账记录
        this.transactions.add(new Transaction(TransactionType.TRANSFER_OUT,amount,"转账至" + targetAccount.getAccountNumber()));
    }
    //查询余额
    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }
    //生成对账单
    public void printStatement(){
        System.out.println("账户：" + accountNumber + "的对账单");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("当前余额" + balance);
    }
    //账户状态管理
    public void freezeAccount() {
        status = AccountStatus.FROZEN;
    }
    public void activateAccount() {
        status = AccountStatus.ACTIVE;
    }
    public void closeAccount() {
        status = AccountStatus.CLOSED;
    }
}
