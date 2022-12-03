package pl.kurs.excercise3.service;

import pl.kurs.excercise3.model.BankAccount;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class BankService {
    private int counter;
    private String[] historyArray;
    private OffsetDateTime odt = OffsetDateTime.now( ZoneOffset.UTC );

//    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());


    public void setArray(int lenght) { historyArray = new String[lenght];

    }

    private void paymentOperation(double payment) {
        String log = odt + " wykonono operację: (wpłata) na kwotę: " + payment;
        historyArray[counter++] = log;
    }

    private void paycheckOperation(double payment) {
        String log = odt + " wykonono operację: (wypłata) na kwotę: " + payment;
        historyArray[counter++] = log;
    }

    private void transferOperation(double payment) {
        String log = odt + " wykonono operację: (przelew) na kwotę: " + payment;
        historyArray[counter++] = log;
    }

    public void paymentOnAccount(BankAccount account, double payment) {
        account.setBalance(account.getBalance() + payment);
        System.out.println("Wpłaciłeś: " + payment + " na konto. Aktualny stan konta wynosi: " + account.getBalance());
        paymentOperation(payment);
    }

    public void paymentFromAccount(BankAccount account, double payment) {
        if (account.getBalance() > payment) {
            account.setBalance(account.getBalance() - payment);
            System.out.println("Wypłaciłeś: " + payment + " z konta. Aktualny stan konta wynosi: " + account.getBalance());
        } else {
            System.out.println("Nie masz wystarczającej ilości środków na koncie");
        }
        paycheckOperation(payment);
    }

    public void paymentOnAnotherAccount(BankAccount account, BankAccount account2, double payment) {
        if (account.getBalance() > payment) {
            account.setBalance(account.getBalance() - payment);
            account2.setBalance(account2.getBalance() + payment);
            System.out.println("Przeniesiono środki: " + payment + " na konto użytkownika: " + account2.getName() + ", Banku " + account2.getBankName() + ". Aktualny stan konta wynosi: " + account.getBalance());
        } else {
            System.out.println("Nie masz wystarczającej ilości środków na koncie");
        }
        transferOperation(payment);
    }

    public void printOperationHistory() {
        for (int i = 0; i < historyArray.length; i++) {
            if(historyArray[i] != null){
            System.out.println(historyArray[i]);}
        }
    }
}


