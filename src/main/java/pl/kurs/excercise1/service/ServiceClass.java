package pl.kurs.excercise1.service;

import org.jetbrains.annotations.NotNull;

public class ServiceClass {

    public void getHighestNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Największa liczba to: " + maxNumber);
    }
    public void getLowestNumber(int[] array) {
        int lowNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowNumber) {
                lowNumber = array[i];
            }
        }
        System.out.println("Najmniejsza liczba to: " + lowNumber);
    }
    private static int getDivisorsNumber(int n) {
        int counter = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n != 0 && n % i == 0) {
                counter++;
            }
        }
        return counter;
    }
    public void getHighestNumberOfDivisors(int[] array) {
        int counter = 0;
        int maxDivisorsNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            int numberDivisors = getDivisorsNumber(array[i]);
            if (numberDivisors > counter) {
                counter = numberDivisors;
                maxDivisorsNumber = array[i];
            }
        }
        System.out.println("Liczba z największą ilością dzielników to: " + maxDivisorsNumber);
    }

    private static boolean isPrime(int n) {
//        if(n < 2) {
//            return false;
//        }
//        if(getDivisorsNumber(n) == 2);
//        return true;
        if (n < 2)
            return false;

        for (int i = 2, max = (int)Math.sqrt(n); i <= max; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    public void getNumberOfPrimeNumbers(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                counter++;
            }
        }
        System.out.println("Ilość liczb pierwszych to: " + counter);
    }

}
