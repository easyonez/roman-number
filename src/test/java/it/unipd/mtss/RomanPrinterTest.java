////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void printAscii_returnsEmpty_when0() {
        String result = RomanPrinter.print(0);
        assertEquals("", result);
    }

    @Test
    public void printAscii_returnsI_inAsciiArt_When1() {
        String result = RomanPrinter.print(1);
        String real =
                " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n";

        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsIV_inAsciiArt_When4() {
        String result = RomanPrinter.print(4);
        String real =
                " _____  __      __\n" +
                        "|_   _| \\ \\    / /\n" +
                        "  | |    \\ \\  / / \n" +
                        "  | |     \\ \\/ /  \n" +
                        " _| |_     \\  /   \n" +
                        "|_____|     \\/    \n";

        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsV_inAsciiArt_When5() {
        String result = RomanPrinter.print(5);
        String real =
                "__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n";

        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsIX_inAsciiArt_When9() {
        String result = RomanPrinter.print(9);
        String real =
                " _____  __   __\n" +
                        "|_   _| \\ \\ / /\n" +
                        "  | |    \\ V / \n" +
                        "  | |     > <  \n" +
                        " _| |_   / . \\ \n" +
                        "|_____| /_/ \\_\\\n";
        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsXXXVIII_inAsciiArt_When38() {
        String result = RomanPrinter.print(38);
        String real =
                "__   __ __   __ __   __ __      __  _____   _____   _____ \n" +
                "\\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _| |_   _| |_   _|\n" +
                " \\ V /   \\ V /   \\ V /   \\ \\  / /    | |     | |     | |  \n" +
                "  > <     > <     > <     \\ \\/ /     | |     | |     | |  \n" +
                " / . \\   / . \\   / . \\     \\  /     _| |_   _| |_   _| |_ \n" +
                "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____| |_____| |_____|\n";

        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsXL_inAsciiArt_When40() {
        String result = RomanPrinter.print(40);
        String real =
                "__   __  _      \n" +
                        "\\ \\ / / | |     \n" +
                        " \\ V /  | |     \n" +
                        "  > <   | |     \n" +
                        " / . \\  | |____ \n" +
                        "/_/ \\_\\ |______|\n";

        assertEquals(real, result);
    }

    @Test
    public void printAscii_returnsL_inAsciiArt_When50() {
        String result = RomanPrinter.print(50);
        String real =
                " _      \n" +
        "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n";
        assertEquals(real, result);

    }

    @Test
    public void printAscii_returnsC_inAsciiArt_When100() {
        String result = RomanPrinter.print(100);
        String real =
                "  ____  \n" +
                        " / ___| \n" +
                        "| |     \n" +
                        "| |     \n" +
                        "| |____ \n" +
                        " \\____| \n";
        assertEquals(real, result);

    }

    @Test
    public void printAscii_returnsD_inAsciiArt_When500() {
        String result = RomanPrinter.print(500);
        String real =
                " _____  \n" +
                        "|  __ \\ \n" +
                        "| |  | |\n" +
                        "| |  | |\n" +
                        "| |__| |\n" +
                        "|_____/ \n";
        assertEquals(real, result);

    }

    @Test
    public void printAscii_returnsM_inAsciiArt_When1000() {
        String result = RomanPrinter.print(1000);
        String real =
                " __  __ \n" +
                        "|  \\/  |\n" +
                        "| \\  / |\n" +
                        "| |\\/| |\n" +
                        "| |  | |\n" +
                        "|_|  |_|\n";
        assertEquals(real, result);

    }

    @Test
    public void getAsciiLetter_ReturnsEmptyArray_whenInvalidCharacter() {
        String[] result = RomanPrinter.getAsciiLetter('Z');
        assertEquals(6, result.length);
        assertNull(result[0]);
    }




}