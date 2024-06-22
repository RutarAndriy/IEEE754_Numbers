package com.rutar.ieee754_numbers;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;
import static com.rutar.ieee754_numbers.IEEE754_Numbers.*;

// ............................................................................

/**
 * Клас IEEE754_Numbers_Test
 * @author Rutar_Andriy
 * 21.06.2024
 */

@DisplayName("Main test class")
public class IEEE754_Numbers_Test {

private static final String RESOURCES_PATH =
    "src/test/resources/com/rutar/ieee754_numbers/";

///////////////////////////////////////////////////////////////////////////////

@Test
@DisplayName("Should pass")
void should_Answer_With_True()
    { assertTrue(true); }

///////////////////////////////////////////////////////////////////////////////

@Test
@DisplayName("File .empty exist")
void file_Empty_Exist()
    { File file = new File(RESOURCES_PATH + ".empty");
      assertTrue(file.exists()); }

///////////////////////////////////////////////////////////////////////////////

@Nested
@DisplayName("# Library test class")
class Library_Test {

    // ........................................................................

    @DisplayName("decodeOnly") // byte[] -> double
    @ParameterizedTest(name = "({0}) -> [{1}]")
    @CsvSource(
        value = { "00 00 00 00 00 00 00 C0 02 40 >                 12",
                  "00 00 00 00 00 00 00 FA 07 40 >                500", 
                  "34 33 33 33 33 33 33 B3 FE BF >               -0.7", 
                  "9A 99 99 99 99 99 99 D9 FF BF >               -1.7", 
                  "F7 EA 49 26 D6 21 4C D9 03 C0 > -27.16217391304348", 
                  "32 9F A9 96 27 88 82 8E 04 C0 > -35.62747251374313", 
                  "15 72 A2 D0 84 C0 2E F0 11 40 > 491894.01621276594", 
                  "86 1B D7 32 0F 26 AD 9D 15 40 >  5166739.029684755" },
        delimiter = '>')
    void decodeOnly (String array, double expected)
        { byte[] bytes = HexFormat.of().parseHex(array.replaceAll(" ", ""));
          double result = extendedBytesToDouble(bytes);
          assertEquals(result, expected, 0.000001); }
    
    // ........................................................................

    @DisplayName("encodeOnly") // double -> byte[]
    @ParameterizedTest(name = "({0}) <- [{1}]")
    @CsvSource(
        value = { "00 00 00 00 00 00 00 C0 02 40 <                 12",
                  "00 00 00 00 00 00 00 FA 07 40 <                500", 
                  "34 33 33 33 33 33 33 B3 FE BF <               -0.7", 
                  "9A 99 99 99 99 99 99 D9 FF BF <               -1.7", 
                  "F7 EA 49 26 D6 21 4C D9 03 C0 < -27.16217391304348", 
                  "32 9F A9 96 27 88 82 8E 04 C0 < -35.62747251374313", 
                  "15 72 A2 D0 84 C0 2E F0 11 40 < 491894.01621276594", 
                  "86 1B D7 32 0F 26 AD 9D 15 40 <  5166739.029684755" },
        delimiter = '<')
    void encodeOnly (String array, double number)
        { byte[] result = doubleToExtendedBytes(number);
          byte[] expected = HexFormat.of().parseHex(array.replaceAll(" ", ""));
          boolean equals = Arrays.equals(result, expected);
          if (equals == false) {
              double resultNumber   = extendedBytesToDouble(result);
              double expectedNumber = extendedBytesToDouble(expected);
              assertEquals(resultNumber, expectedNumber, 0.000001);
          }
          else { assertTrue(equals); } }
    
    // ........................................................................

    @DisplayName("encodeAndDecode") // double -> byte[] -> double
    @ParameterizedTest(name = "({0})")
    @CsvSource(
        value = { "-784.234",
                  "-34.7",
                  "-4",
                  "0",
                  "2",
                  "3.1415",
                  "96.157",
                  "278965.237578" })
    void encodeAndDecode (double expected)
        { byte[] bytes  = doubleToExtendedBytes(expected);
          double result = extendedBytesToDouble(bytes);
          assertEquals(result, expected, 0.000001); }

}

// Кінець класу IEEE754_Numbers_Test //////////////////////////////////////////

}
