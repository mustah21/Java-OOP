package java6_2.Controller;

import java6_2.View.CurrencyView;
import java6_2.Model.Converter;

public class ConverterController {
    private CurrencyView view;
    private Converter converter;

    public ConverterController(CurrencyView view, Converter converter) {
        this.view = view;
        this.converter = converter;
    }

    public void handleConvert(double amount, String sourceCurrency, String targetCurrency) {
        String textAmount = String.valueOf(amount);
        if (!textAmount.isEmpty()) {
            double converted = converter.convert(amount, sourceCurrency, targetCurrency);

            if (view.amountTwo.getText().isEmpty()) {
                view.updateAmountTwo((int) converted);
            } else {
                view.updateAmountOne((int) converted);
            }

        } else {
            view.showMessage("Please enter a valid amount");
        }

    }
}
