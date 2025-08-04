package _08Test;
/**
 * 储蓄账户
 * */
public class SavingAccount extends Account{
    private double interestRate; //年利率

    public SavingAccount(String accountNumber, Customer owner, double balance,  double interestRate) {
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) throws _08Test.AccountException {
        if(amount <= 0){
            throw new _08Test.AccountException("取款金额必须大于0");
        }
        if(getBalance() < amount ){
            throw new _08Test.AccountException("余额不足");
        }
        if(getStatus() != AccountStatus.ACTIVE){
            throw new _08Test.AccountException("账户状态异常，不能取款");
        }
        setBalance(getBalance() - amount);
        getTransactions().add(new Transaction(TransactionType.WITHDRAWA,amount,"取款"));
    }
    public void calculateInterest(){
        double interest = getBalance() * interestRate;
        try {
            deposit(interest);
        } catch (_08Test.AccountException e) {

        }
        getTransactions().add(new Transaction(TransactionType.DEPOSIT,interest,"利息收入"));
    }
}
