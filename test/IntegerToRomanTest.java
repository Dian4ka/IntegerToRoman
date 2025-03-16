import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    private final IntegerToRoman converter = new IntegerToRoman();

    @Test public void test1() { assertEquals("I", converter.intToRoman(1)); }
    @Test public void test2() { assertEquals("II", converter.intToRoman(2)); }
    @Test public void test3() { assertEquals("III", converter.intToRoman(3)); }
    @Test public void test4() { assertEquals("IV", converter.intToRoman(4)); }
    @Test public void test5() { assertEquals("V", converter.intToRoman(5)); }
    @Test public void test6() { assertEquals("VI", converter.intToRoman(6)); }
    @Test public void test7() { assertEquals("VII", converter.intToRoman(7)); }
    @Test public void test8() { assertEquals("VIII", converter.intToRoman(8)); }
    @Test public void test9() { assertEquals("IX", converter.intToRoman(9)); }
    @Test public void test10() { assertEquals("X", converter.intToRoman(10)); }
    @Test public void test20() { assertEquals("XX", converter.intToRoman(20)); }
    @Test public void test30() { assertEquals("XXX", converter.intToRoman(30)); }
    @Test public void test40() { assertEquals("XL", converter.intToRoman(40)); }
    @Test public void test50() { assertEquals("L", converter.intToRoman(50)); }
    @Test public void test90() { assertEquals("XC", converter.intToRoman(90)); }
    @Test public void test100() { assertEquals("C", converter.intToRoman(100)); }
    @Test public void test400() { assertEquals("CD", converter.intToRoman(400)); }
    @Test public void test500() { assertEquals("D", converter.intToRoman(500)); }
    @Test public void test900() { assertEquals("CM", converter.intToRoman(900)); }
    @Test public void test1000() { assertEquals("M", converter.intToRoman(1000)); }
    @Test public void test1987() { assertEquals("MCMLXXXVII", converter.intToRoman(1987)); }
    @Test public void test3999() { assertEquals("MMMCMXCIX", converter.intToRoman(3999)); }
}
