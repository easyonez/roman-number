////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    final static String[] I = {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|" };

    final static String[] V = {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    " };

    final static String[] X = {
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\" };

    final static String[] L = {
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|"
    };

    final static String[] C = {
            "  ____  ",
            " / ___| ",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\____| "
    };

    final static String[] D = {
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
    };

    final static String[] M = {
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
    };

    static String[] getAsciiLetter(char romanCharacter) {
        switch (romanCharacter) {
            case 'I': return I;
            case 'V': return V;
            case 'X': return X;
            case 'L': return L;
            case 'C': return C;
            case 'D': return D;
            case 'M': return M;
            default: return new String[6];
        }
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == "") {
            return romanNumber;
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                char let = romanNumber.charAt(j);
                String[] AsciiLetter = getAsciiLetter(let);
                result.append(AsciiLetter[i]);
                if(j + 1 < romanNumber.length()) {
                    result.append(" ");
                }
            }
            result.append('\n');
        }
        return result.toString();
    }
}
