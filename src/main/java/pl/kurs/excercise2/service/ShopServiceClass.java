package pl.kurs.excercise2.service;

import pl.kurs.excercise2.model.Product;

public class ShopServiceClass {

    public void getAveragePricesOfAGHProducts(Product[] array) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
                String agd = array[i].getCategory();
                if (agd.equals("AGD")) {
                    counter++;
                    sum += array[i].getPrice();
            }
        }
        double average = sum / counter;
        System.out.println("Średnia cena produktów AGD wynosi: " + average);
    }

    public void getAveragePricesOfProducts(Product[] array) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
                    counter++;
                    sum += array[i].getPrice();
            }
        double average = sum / counter;
        System.out.println("Średnia cena produktów wynosi: " + average);
    }

    public void getCheapestProduct(Product[] array) {
        Product lowerNumber = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i].getPrice() < lowerNumber.getPrice()) {
                    lowerNumber = array[i];
                }
        }
        System.out.println("Produkt o najniższej cenie to: "  + lowerNumber.getName());
    }

    public void getMostExpensiveProduct(Product[] array) {
        Product highestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
                if (array[i].getPrice() > highestNumber.getPrice()) {
                    highestNumber = array[i];
            }
        }
        System.out.println("Produkt o najwyższej cenie to: "  + highestNumber.getName());
    }

    public void getProductsMoreExpensiveThanAveragePrice(Product[] array) {
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
                counter++;
                sum += array[i].getPrice();
        }

        double average = sum / counter;
        for (int i = 0; i < array.length; i++) {
                if (array[i].getPrice() > average) {
                    System.out.println("Produkt droższy od średniej: " + array[i].getName());
            }
        }
    }
}