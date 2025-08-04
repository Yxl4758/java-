package _08Test;

import java.time.LocalDateTime;

public class Transaction {
    private final TransactionType type;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String description;

    public Transaction(TransactionType type, double amount, String description) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("[%s]: 金额%.2f, 时间%s, 备注:%s",
                type,  amount,timestamp, description);
    }
}
