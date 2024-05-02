package optimizaciónrefactorizacion;

import java.util.Scanner;

public class e1{ //Renombrado de clase a "e1"  (IMPLEMENTA LA INTERFAZ)
  
    private static int numero; //Renombrado de variable a "numero"
    private static boolean es_primo; //Renombrado de variable a "es_primo"     
    
  public e1() { //GENERAMOS CONSTRUCTOR Y DESDE AQUÍ INICIALIZAMOS VARIABLES
    numero = 0; 
    es_primo = true;    
  }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Renombrado de variable a "leer"
        
        System.out.print("Ingrese un número: ");
        setNumero(leer.nextInt());
        
        if( comprobacionPrimos(getNumero(), isEs_primo())) return;
    }

    public static boolean comprobacionPrimos(int numero, boolean es_primo) {
        if (numero < 2) {
            System.out.println("El número debe ser mayor o igual a 2.");
            return true;
        }
        for(int i=2; i<numero; i++) {
            if(numero % i == 0) {
                es_primo = false;
                break;
            }
        }   if(es_primo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }   return false;
    }

    /**
     * @return the numero
     */
    public static int getNumero() {
        return numero;
    }

    /**
     * @param aNumero the numero to set
     */
    public static void setNumero(int aNumero) {
        numero = aNumero;
    }

    /**
     * @return the es_primo
     */
    public static boolean isEs_primo() {
        return es_primo;
    }

    /**
     * @param aEs_primo the es_primo to set
     */
    public static void setEs_primo(boolean aEs_primo) {
        es_primo = aEs_primo;
    }
  
}