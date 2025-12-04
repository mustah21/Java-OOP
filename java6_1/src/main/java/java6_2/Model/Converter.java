package java6_2.Model;

import java.util.HashMap;

public class Converter {

    private final HashMap<String, Double> currencies = new HashMap<>();

    public Converter() {
        currencies.put("USD", 1.0);
        currencies.put("EUR", 1.16);
        currencies.put("GBP", 1.32);
    }

    public double convert(double amount, String sourceCode, String targetCode) {
        double amountInUsd = amount * currencies.get(sourceCode);
        return amountInUsd / currencies.get(targetCode);
    }

}
