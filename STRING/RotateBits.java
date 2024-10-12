
// Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and return the results in their decimal representation after each of the rotation.

public class RotateBits {
    public int[] rotate(int N, int D) {
        String binary = Integer.toBinaryString(N);
        String leftBinary = binary.substring(D) + binary.substring(0, D);
        int leftDecimal = Integer.parseInt(leftBinary, 2);
        String rightBinary = binary.substring(binary.length() - D) + binary.substring(0, binary.length() - D);
        int rightDecimal = Integer.parseInt(rightBinary, 2);
        return new int[] { leftDecimal, rightDecimal };
    }

    public static void main(String[] args) {
        RotateBits obj = new RotateBits();
        int N = 60;
        int D = 4;
        int[] result = obj.rotate(N, D);
        System.out.println("Left rotation: " + result[0] + ", Right rotation: " + result[1]);
    }
}

// The time complexity is O(n), where `n` is the number of bits in `N` due
// to string manipulations and parsing. The space complexity is also O(n)
// due to storing the binary strings.