package pl.kurs.excercise3.model;

import java.io.Serializable;
import java.util.Arrays;

public class BankAccount implements Serializable {

    private String name;
    private String bankName;
    private long number;
    private String ownerPesel;
    private double interest;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String name, String bankName, long number, String ownerPesel, double interest, double balance) {
        this.name = name;
        this.bankName = bankName;
        this.number = number;
        this.ownerPesel = ownerPesel;
        this.interest = interest;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getOwnerPesel() {
        return ownerPesel;
    }

    public void setOwnerPesel(String ownerPesel) {
        this.ownerPesel = ownerPesel;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", bankName='" + bankName + '\'' +
                ", number=" + number +
                ", ownerPesel='" + ownerPesel + '\'' +
                ", interest=" + interest +
                ", balance=" + balance;
    }
}
