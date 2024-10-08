// Given a string s. The task is to convert characters of string to lowercase.

public class ConvertStringToLowerCase {
    public String lowerCase(String str) {
        String lowerCaseString = str.toLowerCase();
        return lowerCaseString;
    }

    public static void main(String[] args) {
        ConvertStringToLowerCase obj = new ConvertStringToLowerCase();
        String str = "Hello World";
        System.out.println(obj.lowerCase(str));
    }
}

// The time complexity is O(n) due to converting each character to
// lowercase. The space complexity is O(n) as a new string of length n is
// created.