package org.fisayo;

/**
 * Optional demo class to showcase library usage.
 * This is not required for the library to function.
 */

public class Main {
    public static void main(String[] args) {
        // Demonstrate converting to Roman numerals
        System.out.println("Converting numbers to Roman numerals:");
        int[] numbers = {4, 9, 49, 99, 500, 2023};
        for (int num : numbers) {
            String romanNumeral = RomanNumeralConverter.toRoman(num);
            System.out.println(num + " → " + romanNumeral);
        }

        // Demonstrate converting from Roman numerals
        System.out.println("\nConverting Roman numerals to numbers:");
        String[] romanNumerals = {"IV", "IX", "XLIX", "XCIX", "D", "MMXXIII"};
        for (String roman : romanNumerals) {
            int arabicNumber = RomanNumeralConverter.toArabic(roman);
            System.out.println(roman + " → " + arabicNumber);
        }
    }
}