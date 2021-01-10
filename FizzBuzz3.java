import java.io.*;
import java.util.*;

class FizzBuzz3 {
  
  class Pair {
    String type;
    String value;
    
    Pair(String type, String value) {
      this.type = type;
      this.value = value;
    }
  }
  
  // hashmap used for keeping the counts
  private HashMap<String, Integer> counts;
  
  // constructor
  FizzBuzz3 () {
    this.counts = new HashMap<String, Integer>();
  }
  
  // return a string with the counts
  private String getCounts() {
    String result = "";

    for (Map.Entry<String, Integer> entry : counts.entrySet()) {
        result += entry.getKey() + ": " + entry.getValue().toString() + "\n";
    }
    
    return result;
  }
  
  // get the multiple string and update the counts
  private String getMultiple(int n) {
    boolean contains3 = String.valueOf(n).contains("3");
    boolean isMultipleOf3 = n % 3 == 0;
    boolean isMultipleOf5 = n % 5 == 0;
    String type, value;
    
    if (contains3) {
      type = value = "lucky";
    } else if (isMultipleOf3 && isMultipleOf5) {
      type = value = "fizzbuzz";
    } else if (isMultipleOf3) {
      type = value = "fizz";
    } else if (isMultipleOf5) {
      type = value = "buzz";
    } else {
      type = "Integer";
      value = String.valueOf(n);
    }
    
    // update the counts
    int currentCount = counts.containsKey(type) ? counts.get(type).intValue() : 0;
    counts.put(type, Integer.valueOf(currentCount + 1)); 
    
    return value;
  }
  
  public static void main(String[] args) {
    int max = 20;
    FizzBuzz3 fizzBuzz = new FizzBuzz3();
    for (int i = 1; i <= max; i++) {
      System.out.println(fizzBuzz.getMultiple(i));

    }
    
    System.out.println("\n\nTotal Counts: \n" + fizzBuzz.getCounts());
    
  }
}
