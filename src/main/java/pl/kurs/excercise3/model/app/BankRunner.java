package pl.kurs.excercise3.model.app;

import pl.kurs.excercise3.model.BankAccount;
import pl.kurs.excercise3.service.BankService;

public class BankRunner {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("Konrad", "MBank", 1234545353546546545L, "98145151312", 7.2, 3000);
        BankAccount account2 = new BankAccount("Tomasz", "ING", 6843845353546546545L, "725656513432", 5, 20000);


        BankService bankService = new BankService();

        bankService.setArray(100);

        bankService.paymentOnAccount(account1, 1000);
        bankService.paymentOnAccount(account1, 1000);

        bankService.paymentFromAccount(account1, 500);
        bankService.paymentFromAccount(account1, 500);
        bankService.paymentFromAccount(account1, 500);

        bankService.paymentOnAnotherAccount(account1, account2, 300);
        bankService.paymentOnAnotherAccount(account1, account2, 300);
        bankService.paymentOnAnotherAccount(account1, account2, 300);

        bankService.paymentOnAnotherAccount(account2, account1, 5600);
        bankService.paymentOnAnotherAccount(account2, account1, 5600);
        bankService.paymentOnAnotherAccount(account2, account1, 5600);

//        bankService.printOperationHistory();




    }
}
