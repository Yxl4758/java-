package _08Test;
/**
 * 支票账户
 * */
public class CheckingAccount extends Account{
    private double overdraftLimit;//透支额度
    private double overdrafFee;//透支手续费

    public CheckingAccount(String accountNumber, Customer owner, double balance, double overdraftLimit, double overdrafFee) {
        super(accountNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
        this.overdrafFee = overdrafFee;
    }

    @Override
    public void withdraw(double amount) throws _08Test.AccountException {
        if (amount <= 0){
            throw new _08Test.AccountException("取款金额必须大于0");
        }
        if (getStatus() != AccountStatus.ACTIVE){
            throw new _08Test.AccountException("账户状态异常，不能取款");
        }
        double available = getBalance() + overdraftLimit;
        if (available < amount){
            throw new _08Test.AccountException("超出透支额度");
        }
        setBalance(available - amount);
        //如果透支，收取手续费
        if (getBalance() < 0){
            setBalance(getBalance() - overdrafFee);
            getTransactions().add(new Transaction(TransactionType.WITHDRAWA,amount,"取款（含透支）"));
            getTransactions().add(new Transaction(TransactionType.WITHDRAWA,overdrafFee,"透支手续费"));
        }else {
            getTransactions().add(new Transaction(TransactionType.WITHDRAWA,amount,"取款"));
        }
    }
}
