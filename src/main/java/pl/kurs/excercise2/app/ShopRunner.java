package pl.kurs.excercise2.app;

import pl.kurs.excercise2.model.Product;
import pl.kurs.excercise2.service.ShopServiceClass;

import java.util.Calendar;

public class ShopRunner {
    public static void main(String[] args) {

        Product[] products = new Product[]{
                new Product("Telewizor", 6500, "AGD"),
                new Product("Suszarka", 300, "AGD"),
                new Product("Lodówka", 10000, "AGD"),
                new Product("Chleb", 5.5, "Żywność"),
                new Product("Kurtka", 600, "Ubrania"),
                new Product("Czapka", 100, "Ubrania"),
                new Product("Klawiatura", 470, "AGD"),};

        ShopServiceClass serviceClass = new ShopServiceClass();

        serviceClass.getAveragePricesOfAGHProducts(products);

        serviceClass.getCheapestProduct(products);

        serviceClass.getMostExpensiveProduct(products);

        serviceClass.getAveragePricesOfProducts(products);

        serviceClass.getProductsMoreExpensiveThanAveragePrice(products);

    }
}
