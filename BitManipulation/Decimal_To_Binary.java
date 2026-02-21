
package BitManipulation;

public class Decimal_To_Binary {

    public static String toBinary(int n) {
        if (n == 0)
            return "0";

        StringBuilder binary = new StringBuilder();

        // We check each bit from right to left
        while (n > 0) {
            // Check if the rightmost bit is 1 or 0
            // (n & 1) is equivalent to (n % 2)
            int bit = n & 1;
            binary.append(bit);

            // Right shift n by 1 to move to the next bit
            // (n >> 1) is equivalent to (n / 2)
            n = n >> 1;
        }

        // Since we appended bits from LSB to MSB, we must reverse the string
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + toBinary(num));
    }
}