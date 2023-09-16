import java.io.*;

public static FactorialApplication {
  static int factorial(int num) { 
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
