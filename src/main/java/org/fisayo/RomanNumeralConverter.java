package org.fisayo;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A utility class for converting between Arabic (decimal) and Roman numerals.
 * Supports conversions for numbers between 1 and 3999.
 */
public class RomanNumeralConverter {
    // Ordered map of Roman numeral symbols with their decimal values
    private static final Map<Integer, String> ROMAN_NUMERAL_MAP = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    /**
     * Converts an Arabic (decimal) number to a Roman numeral.
     *
     * @param number The number to convert (1-3999)
     * @return The Roman numeral representation
     * @throws IllegalArgumentException if the number is out of the supported range
     */
    public static String toRoman(int number) {
        // Validate input range
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        StringBuilder result = new StringBuilder();

        // Iterate through Roman numeral map and build the representation
        for (Map.Entry<Integer, String> entry : ROMAN_NUMERAL_MAP.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }

        return result.toString();
    }

    /**
     * Converts a Roman numeral to an Arabic (decimal) number.
     *
     * @param romanNumeral The Roman numeral to convert
     * @return The decimal representation
     * @throws IllegalArgumentException if the input is invalid
     */
    public static int toArabic(String romanNumeral) {
        // Validate input
        if (romanNumeral == null || !romanNumeral.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            throw new IllegalArgumentException("Invalid Roman numeral");
        }

        int result = 0;
        int previousValue = 0;

        // Iterate through the Roman numeral from right to left
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = getSymbolValue(romanNumeral.charAt(i));

            // If current value is less than previous, subtract
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }

    /**
     * Helper method to get the decimal value of a single Roman numeral symbol.
     *
     * @param symbol The Roman numeral symbol
     * @return The decimal value of the symbol
     */
    private static int getSymbolValue(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman numeral symbol: " + symbol);
        };
    }
}
