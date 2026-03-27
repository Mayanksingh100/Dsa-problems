package patterns;

import java.util.Scanner;

public class Triangleleft {
  public static void main(String[] args) {
  /*     int n = 2;
      for(int i =1; i<=n; i++){
        for(int j=1; j<=i; j++){
          System.out.print("*");
        
        }
        System.out.println();

      }
      for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
          System.out.print("*");
        }
      System.out.println();
      }
      
  }
} 
*/
// taken input for the height of the triangle.:
 Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of triangle: ");
      int n = sc.nextInt();
      System.out.println("The triangle is :");
for(int i=1; i<=2*n; i++){
  int stars;
  if(i<=n){
    stars =i;

  }else{
    stars = 2* n-i+1;
  }
  for(int j=1; j<=stars; j++){
    System.out.print("*");
  }
  System.out.println();
}
}
