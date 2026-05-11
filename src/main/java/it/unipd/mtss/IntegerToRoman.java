////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        String[] arr_R = {"D", "CD", "C", "XC", "L",
                        "XL", "X", "IX", "V", "IV", "I"};

        int[] arr_A = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int i = 0;

        while (number > 0) {
            if(number >= arr_A[i]) {
                result.append(arr_R[i]);
                number -= arr_A[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
