package optimizaciónrefactorizacion;

import java.util.Scanner;

public class Ejemplo {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[] n = new int[5];
    
    System.out.println("Ingrese 5 números:");
    for(int i=0; i<5; i++) {
      n[i] = sc.nextInt();
    }
    
    int s = 0;
    for(int i=0; i<5; i++) {
      s += n[i];
    }
    
    double p = (double) s / 5;
    
    System.out.println("La suma de los números es: " + s);
    System.out.println("El promedio de los números es: " + p);
    
  }
  
}
