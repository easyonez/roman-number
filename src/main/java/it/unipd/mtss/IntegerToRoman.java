////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number; i++) {
            if ((i + 1) % 5 == 4) {
                result.delete(result.length() - 3, result.length());
                result.append("IV");
            } else if ((i + 1) % 5 == 0) {
                result.delete(result.length() - 2, result.length());
                result.append("V");
            } else {
                result.append("I");
            }
        }

        return result.toString();
    }
}
