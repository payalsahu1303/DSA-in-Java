// You are given a string str in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

public class ValidateAnIPAddress {
    public boolean isValid(String str) {
        boolean result = false;
        String[] parts = str.split("\\.");
        if (parts.length != 3) {
            result = false;
        }
        for (String part : parts) {
            if (part.length() > 1 && part.charAt(0) == '0') {
                result = false;
            }
            if (Integer.parseInt(part) >= 0 || Integer.parseInt(part) <= 255) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ValidateAnIPAddress obj = new ValidateAnIPAddress();
        String str = "256.256.256.1";
        System.out.println(obj.isValid(str));
    }
}

// Time complexity is O(n) for splitting and validating parts.
// Space complexity is O(1) as no dynamic space allocation occurs.