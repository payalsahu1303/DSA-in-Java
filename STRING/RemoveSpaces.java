// Given a string, remove spaces from it.

import java.util.*;

public class RemoveSpaces{
  public String remove(String str){
    StringBuilder s = new StringBuilder(str);
    String space = " ";
    StringBuilder output = new StringBuilder();
    for(int i =0; i<s.length(); i++){
      if(s.charAt(i) != space.charAt(0)){
        output.append(s.charAt(i));
      }
    }
    return output.toString();
  }
  
  public static void main(String[] args){
    RemoveSpaces obj = new RemoveSpaces();
    String str = "Hello World";
    System.out.println(obj.remove(str));
  }
}

// The time complexity of the above remove method is O(n) because it iterates through each character in the string once. The space complexity is O(n) due to storing the result in a StringBuilder.