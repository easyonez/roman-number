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



}
