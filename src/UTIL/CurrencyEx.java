package UTIL;

import java.util.Arrays;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CurrencyEx {
    public static void main(String[] args) {
        System.out.println(getAllCurrencies());
    }

    public static Set<Currency> getAllCurrencies() {
        Set<Currency> toret = new HashSet<Currency>();
        Locale[] locs = Locale.getAvailableLocales();

        for (Locale loc : locs) {
            try {
                Currency currency = Currency.getInstance(loc);

                if (currency != null) {
                    toret.add(currency);
                }
            } catch (Exception exc) {
                // Locale not found
            }
        }
        System.out.println(Arrays.toString(locs));
        return toret;
    }
}