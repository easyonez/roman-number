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




}
