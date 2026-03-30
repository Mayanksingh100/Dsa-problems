package patterns;

public class Halfpyramidwithnumber {
  public static void main(String[] args) {
      int n = 5;
      for(int i =1 ; i<=n; i++){
        for(int j=1; j<=i; j++){
          System.out.print(j+" ");
        }
        System.out.println();
      }
  }
}


/*
for inverted half pyramid with number

   int n = 5;
      for(int i =1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
          System.out.print(j+" ");
        }
        System.out.println();
      }
 */