package patterns;

import java.util.*;

public class Function {
public static void printFactorial(int n){
  // loop
  if (n < 0){
    System.out.println("invalid number");
    return;
  }
  int factorial = 1;
  for (int i = 1; i <= n; i++){
    factorial = factorial * i;
  }
  System.out.println(factorial);
  return;

}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  printFactorial(n);
  sc.close();

}

}



 /* 
Q. Create a function that takes two integers as input and returns their sum. 
public class Function {
  public static int calculateSum(int a, int b) {
    int sum = a + b;
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calculateSum(a,b);
    System.out.println("sum of two numbers is: " + sum);
    sc.close();
   
  }
}
*/

/*
public class Function {
  public static void printMyName(String name )  {
    System.out.println(name);
    return;
  }
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    printMyName(name);
   sc.close();
  }
}
*/