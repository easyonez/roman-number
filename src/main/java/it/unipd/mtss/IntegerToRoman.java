////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        while (number >= 50) {
            number -= 50;
            result.append("L");
        }

        while (number >= 40) {
            number -= 40;
            result.append("XL");
        }

        while (number >= 10) {
            number -= 10;
            result.append("X");
        }

        while (number >= 9) {
            number -= 9;
            result.append("IX");
        }

        while (number >= 5) {
            number -= 5;
            result.append("V");
        }

        while (number >= 4) {
            number -= 4;
            result.append("IV");
        }

        while (number >= 1) {
            number -= 1;
            result.append("I");
        }

        return result.toString();
    }
}
