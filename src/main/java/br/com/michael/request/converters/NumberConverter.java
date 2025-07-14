package br.com.michael.request.converters;

import br.com.michael.exception.UnsupportedMathOperationException;

public class NumberConverter {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static boolean isNumeric(String strNumber) {

        if (strNumber==null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber==null || strNumber.isEmpty())
            throw new UnsupportedMathOperationException("Please, set a numeric value");

        String nunber = strNumber.replace(",", ".");

        return Double.parseDouble(nunber);
    }
}
