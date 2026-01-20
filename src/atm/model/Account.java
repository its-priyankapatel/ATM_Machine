package atm.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private long account_no;
    private int pin;
    private BigDecimal balance;
    private String status;
    private LocalDateTime createdAt;

    public Account(){

    }
    public Account(long account_no, int pin, BigDecimal balance, String status){
        this.account_no=account_no;
        this.pin=pin;
        this.balance=balance;
        this.status=status;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
