package functions;
import java.util.*;
public class printoddsum {


  public static void printOddSum(int n){
    int sum = 0;
    for (int i=1; i<=n; i++){
      if (i % 2 != 0){
        sum = sum + i ;
      }
    }
    System.out.println("Sum of odd numbers = " + sum);
  }
  public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printOddSum(n);
    sc.close();
  }
  
}
