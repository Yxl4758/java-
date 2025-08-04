package _08Test;

public class LoanAccount extends Account{
    private double interestRate;
    private double loanAmount;//贷款总额

    public LoanAccount(String accountNumber, Customer owner, double balance, double loanAmount, double interestRate) {
        super(accountNumber, owner, 0);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) throws _08Test.AccountException {
        if (amount <= 0){
            throw new _08Test.AccountException("还款金额必须大于0");
        }
        setBalance(getBalance() + amount); //余额为负表示未还贷款，存款使余额增加（向0靠近）
        getTransactions().add(new Transaction(TransactionType.DEPOSIT,amount,"还款"));
    }

    @Override
    public void withdraw(double amount) throws _08Test.AccountException {
        throw new _08Test.AccountException("贷款账户不能取款");
    }

    //计算利息（每月）
    public void calculateInterest(){
        double interest = loanAmount * interestRate;
        setBalance(getBalance() - interest);
        getTransactions().add(new Transaction(TransactionType.WITHDRAWA,interest,"贷款利息"));
    }
}
