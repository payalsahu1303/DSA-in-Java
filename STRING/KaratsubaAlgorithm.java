// Given two binary strings A and B that represent value of two integers, find the product of two strings in Decimal Value.

public class KaratsubaAlgorithm {
    public long multiply(String A, String B) {
        long a = Long.parseLong(A, 2);
        long b = Long.parseLong(B, 2);
        return a * b;
    }

    public static void main(String[] args) {
        KaratsubaAlgorithm obj = new KaratsubaAlgorithm();
        String A = "1100";
        String B = "110";
        System.out.println(obj.multiply(A, B));
    }
}

// The given Karatsuba algorithm code uses basic multiplication rather than
// Karatsuba's optimized method. Its time complexity is O(n) for parsing
// binary strings and converting them to long integers, and O(1) for
// multiplication. Space complexity is O(1) as no additional space is
// required beyond input size.