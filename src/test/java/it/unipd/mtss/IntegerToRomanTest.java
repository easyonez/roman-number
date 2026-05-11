////////////////////////////////////////////////////////////////////
// Edoardo De Piccoli 2101055
// Aala Ajmaime 2169194
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert_returnsEmpty_when0() {
        String result = IntegerToRoman.convert(0);

        assertEquals("", result);
    }

    @Test
    public void convert_returnsI_when1() {
        String result = IntegerToRoman.convert(1);

        assertEquals("I", result);
    }

    @Test
    public void convert_returnsII_when2() {
        String result = IntegerToRoman.convert(2);

        assertEquals("II", result);
    }

    @Test
    public void convert_returnsIII_when3() {
        String result = IntegerToRoman.convert(3);

        assertEquals("III", result);
    }

    @Test
    public void convert_returnsIV_when4() {
        String result = IntegerToRoman.convert(4);

        assertEquals("IV", result);
    }

    @Test
    public void convert_returnsV_when5() {
        String result = IntegerToRoman.convert(5);

        assertEquals("V", result);
    }

    @Test
    public void convert_returnsVI_when6() {
        String result = IntegerToRoman.convert(6);

        assertEquals("VI", result);
    }

    @Test
    public void convert_returnsVII_when7() {
        String result = IntegerToRoman.convert(7);

        assertEquals("VII", result);
    }

    @Test
    public void convert_returnsIX_when9() {
        String result = IntegerToRoman.convert(9);

        assertEquals("IX", result);
    }

    @Test
    public void convert_returnsX_when10() {
        String result = IntegerToRoman.convert(10);

        assertEquals("X", result);
    }

    @Test
    public void convert_returnsXI_when11() {
        String result = IntegerToRoman.convert(11);

        assertEquals("XI", result);
    }

    @Test
    public void convert_returnsXIII_when13() {
        String result = IntegerToRoman.convert(13);

        assertEquals("XIII", result);
    }


    @Test
    public void convert_returnsXV_when15() {
        String result = IntegerToRoman.convert(15);

        assertEquals("XV", result);
    }

    @Test
    public void convert_returnsXVIII_when18() {
        String result = IntegerToRoman.convert(18);

        assertEquals("XVIII", result);
    }

    @Test
    public void convert_returnsXIX_when19() {
        String result = IntegerToRoman.convert(19);

        assertEquals("XIX", result);
    }

    @Test
    public void convert_returnsXX_when20() {
        String result = IntegerToRoman.convert(20);

        assertEquals("XX", result);
    }

    @Test
    public void convert_returnsXXII_when22() {
        String result = IntegerToRoman.convert(22);

        assertEquals("XXII", result);
    }

    @Test
    public void convert_returnsXXXV_when35() {
        String result = IntegerToRoman.convert(35);

        assertEquals("XXXV", result);
    }

    @Test
    public void convert_returnsXL_when40() {
        String result = IntegerToRoman.convert(40);

        assertEquals("XL", result);
    }

    @Test
    public void convert_returnsXLII_when42() {
        String result = IntegerToRoman.convert(42);

        assertEquals("XLII", result);
    }

    @Test
    public void convert_returnsXLV_when45() {
        String result = IntegerToRoman.convert(45);

        assertEquals("XLV", result);
    }

    @Test
    public void convert_returnsL_when50() {
        String result = IntegerToRoman.convert(50);

        assertEquals("L", result);
    }

    @Test
    public void convert_returnsLXXXVIII_when88() {
        String result = IntegerToRoman.convert(88);

        assertEquals("LXXXVIII", result);
    }
    @Test
    public void convert_returnsXC_when90() {
        String result = IntegerToRoman.convert(90);

        assertEquals("XC", result);
    }

    @Test
    public void convert_returnsXCIX_when99() {
        String result = IntegerToRoman.convert(99);

        assertEquals("XCIX", result);
    }

    @Test
    public void convert_returnsC_when100() {
        String result = IntegerToRoman.convert(100);

        assertEquals("C", result);
    }

    @Test
    public void convert_returnsCI_when101() {
        String result = IntegerToRoman.convert(101);

        assertEquals("CI", result);
    }

    @Test
    public void convert_returnsC_when399() {
        String result = IntegerToRoman.convert(399);

        assertEquals("CCCXCIX", result);
    }

    @Test
    public void convert_returnsCD_when400() {
        String result = IntegerToRoman.convert(400);

        assertEquals("CD", result);
    }

    @Test
    public void convert_returnsCDLXVI_when466() {
        String result = IntegerToRoman.convert(466);

        assertEquals("CDLXVI", result);
    }

    @Test
    public void convert_returnsD_when500() {
        String result = IntegerToRoman.convert(500);

        assertEquals("D", result);
    }

    @Test
    public void convert_returnsDLV_when555() {
        String result = IntegerToRoman.convert(555);

        assertEquals("DLV", result);
    }

    @Test
    public void convert_returnsDCCCLXXVII_when877() {
        String result = IntegerToRoman.convert(877);

        assertEquals("DCCCLXXVII", result);
    }

    @Test
    public void convert_returnsCM_when900() {
        String result = IntegerToRoman.convert(900);

        assertEquals("CM", result);
    }

    @Test
    public void convert_returnsM_when1000() {
        String result = IntegerToRoman.convert(1000);

        assertEquals("M", result);
    }
}

