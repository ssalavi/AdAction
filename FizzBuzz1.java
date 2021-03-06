import java.io.*;
import java.util.*;

class FizzBuzz1 {
  static String getMultiple(int n) {
    boolean isMultipleOf3 = n % 3 == 0;
    boolean isMultipleOf5 = n % 5 == 0;
    String result = "";
    
    if (isMultipleOf3 && isMultipleOf5) {
      result = "fizzbuzz";
    } else if (isMultipleOf3) {
      result = "fizz";
    } else if (isMultipleOf5) {
      result = "buzz";
    } else {
      result = String.valueOf(n);
    }
    
    return result;
  }
  
  public static void main(String[] args) {
    int max = 20;
    
    for (int i = 1; i <= max; i++) {
      System.out.println(getMultiple(i));
    }
  }
}
