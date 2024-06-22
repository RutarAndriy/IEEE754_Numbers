package com.rutar.ieee754_numbers;

// ............................................................................

import java.math.*;
import at.syntaxerror.ieee754.binary.*;

/**
 * Клас IEEE754_Numbers
 * Дозволяє виконувати перетворення із/у Extended-формат.
 * Базується на бібліотеці 
 * <a href="https://github.com/Synt4xErr0r4/ieee754-java">ieee754-java</a> 
 * пана <a href="https://github.com/Synt4xErr0r4">Synt4xErr0r4</a> 
 * @author Rutar_Andriy
 * 21.06.2024
 */

public class IEEE754_Numbers {

///////////////////////////////////////////////////////////////////////////////

/**
 * Конвертація із double у Extended (представленого у байтах)
 * @param value число типу double
 * @return число типу Extended (представлене у байтах)
 */
public static byte[] doubleToExtendedBytes (double value) {
    
    return reverseArray(Binary80.CODEC
          .encode(Binary80.FACTORY.create(value)).toByteArray());

}

///////////////////////////////////////////////////////////////////////////////

/**
 * Конвертація із Extended (представленого у байтах) у double
 * @param arr число типу Extended (представлене у байтах)
 * @return число типу double
 */
public static double extendedBytesToDouble (byte[] arr) {
    
    return Binary80.CODEC
          .decode(new BigInteger(reverseArray(arr))).doubleValue();

}

///////////////////////////////////////////////////////////////////////////////

/**
 * Інверсія (перевертання) byte-масиву
 * @param arr byte-масив для інверсії
 * @return результат інверсії
 */
public static byte[] reverseArray (byte[] arr) {
    
    byte temp;
    byte[] result = arr.clone();
    
    for (int z = 0; z < result.length / 2; z++) {
        temp = result[z];
        result[z] = result[result.length - 1 - z];
        result[result.length - 1 - z] = temp;
    }
    return result;
}

// Кінець класу IEEE754_Numbers ///////////////////////////////////////////////

}
