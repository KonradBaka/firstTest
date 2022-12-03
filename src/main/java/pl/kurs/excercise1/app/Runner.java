package pl.kurs.excercise1.app;

import pl.kurs.excercise1.service.ServiceClass;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        ServiceClass serviceClass = new ServiceClass();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczby:");

        String textArray[]= scanner.nextLine().split(" ");
        int[] numbersArray = new int[textArray.length]; //
        for(int i =0 ;i < textArray.length;i++) {
            numbersArray[i] = Integer.parseInt(textArray[i]);}

        System.out.println(Arrays.toString(numbersArray));

        serviceClass.getHighestNumber(numbersArray);

        serviceClass.getLowestNumber(numbersArray);

        serviceClass.getHighestNumberOfDivisors(numbersArray);

        serviceClass.getNumberOfPrimeNumbers(numbersArray);


        scanner.close();
    }
}
