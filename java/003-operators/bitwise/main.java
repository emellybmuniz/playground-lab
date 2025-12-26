public class main {
    public static void main(String[] args) {
        var value1 = 2;
        var value2 = 9;

        var binaryValue1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária) %s\n", value1, binaryValue1);

        System.out.println("--------------");

        var binaryValue2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária) %s\n", value2, binaryValue2);

        System.out.println("--------------");

        System.out.println("OR bitewise");
        var resultOR = value1 | value2;
        var binaryResult = Integer.toBinaryString(resultOR);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultOR, binaryResult);
        // if one of the values is 1, the result is 1 (true)

        System.out.println("--------------");

        System.out.println("AND bitewise");
        var resultAnd = value1 & value2;
        var binaryResultAnd = Integer.toBinaryString(resultAnd);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultAnd, binaryResultAnd);
        // if both values are 1, the result is 1 (true)

        System.out.println("--------------");
        
        System.out.println("XOR bitewise");
        var resultXor = value1 ^ value2;
        var binaryResultXor = Integer.toBinaryString(resultXor);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultXor, binaryResultXor); 
        // XOR = exclusive or
        // if both values are the same, the result is 0 (false)
        // if both values are different, the result is 1 (true)

        System.out.println("--------------");

        // Complement bitewise
        System.out.println("Complement bitewise");
        var resultComplement = ~value1;
        var binaryResultComplement = Integer.toBinaryString(resultComplement);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultComplement, binaryResultComplement);
        // Complement = inverte os bits
        // Similar to the NOT operator

        // Shift Operator << 
        System.out.println("Shift left bitewise");
        var resultShiftLeft = value1 << 2; // Shift left by 2 bits
        var binaryResultShiftLeft = Integer.toBinaryString(resultShiftLeft);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultShiftLeft, binaryResultShiftLeft);
        
        // Single right shift operator >>
        System.out.println("Shift right bitewise");
        var resultShiftRight = value1 >> 2; // Shift right by 2 bits
        var binaryResultShiftRight = Integer.toBinaryString(resultShiftRight);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultShiftRight, binaryResultShiftRight);

        // Unsigned right shift operator >>>
        System.out.println("Shift right unsigned bitewise");
        var resultShiftRightUnsigned = value1 >>> 2; // Shift right by 2 bits
        var binaryResultShiftRightUnsigned = Integer.toBinaryString(resultShiftRightUnsigned);
        System.out.printf("Resultado da operação %s (representação binária) %s\n", resultShiftRightUnsigned, binaryResultShiftRightUnsigned);
    }
bool


}// Before a unit number, we have zeros to complete a byte (8 bits)
// ...00000110 = 6
// ...00000101 = 5

/*  
 * 0 = false
 * 1 = true
 * 1     1    0
 * |     |    |
 * 1     0    1
 * -------------- result below
 * true true true
 */