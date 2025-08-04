package _08Test;

public class AccountFactory {
    public static Account createAccount(String type,String accountNumber,double balance,Customer owner,Object... params) {
        switch (type) {
            case "Savings":
                double interestRate = (double)params[0];
                return new SavingAccount(accountNumber,owner,balance,interestRate);
            case "Checking":
                double overdraftLimit = (double)params[0];
                double overdraftFee = (double)params[1];
                return new CheckingAccount(accountNumber,owner,balance,overdraftLimit,overdraftFee);
            case "loan":
                double loanAmount = (double)params[0];
                double loanInterestRate = (double)params[1];
                return new LoanAccount(accountNumber,owner,balance,loanAmount,loanInterestRate);
            default:
                throw new IllegalArgumentException("不支持的账户类型");
        }
    }
}
