import java.io.*;

public class FactorialApplication {
  static int factorial(int num) { 
    if (num == 0)
      return 0;
    if (num == 1)
      return 1;
    else
      return num * factorial(num - 1);
  }
  
  public static void main (String args[]) { 
    int n = 5;
    System.out.println("Factorial of the number is " + factorial(n));
  }
}
