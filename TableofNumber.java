import java.util.Scanner;

public class TableofNumber {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number for table: ");
   int n = sc.nextInt();
   for (int i=n; i<11 ; i++){
    System.out.println(i*n);
   }
  }
}
