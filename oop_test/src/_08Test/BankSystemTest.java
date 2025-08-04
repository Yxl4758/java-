package _08Test;

public class BankSystemTest {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Customer customer1 = new Customer("C001", "张三");
        bank.addCustomer(customer1);
        try {
            // 创建储蓄账户
            Account savings = AccountFactory.createAccount("Savings", "SA001", 10000, customer1, 3.0);
            customer1.addAccount(savings);
            savings.deposit(5000);
            savings.withdraw(2000);
            // 创建支票账户
            Account checking = AccountFactory.createAccount("Checking", "CA001", 5000, customer1, 2000.0, 20.0);
            customer1.addAccount(checking);
            checking.withdraw(6000); // 取6000，余额5000，透支1000，手续费20，所以实际余额=5000-6000-20=-1020
            // 转账
            savings.transfer(checking, 3000); // 从储蓄转3000到支票
            // 打印对账单
            savings.printStatement();
            checking.printStatement();
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}
