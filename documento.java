import java.util.Scanner;
public class documento {
    public static int realizarMultiplicacion(int a, int b) {
        int resultado = a * b;
        return resultado;
    }
    public static int realizarSuma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    public static int realizarResta(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int realizarDivision(int a, int b) {
        int resultado = a / b;
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el primer número a continuación");
        int a = leer.nextInt();
        System.out.println("Introduce el segundo número a continuación");
        int b = leer.nextInt();
        leer.close();
        System.out.print("El resultado de a * b es: "+multiplicar(a, b));
        System.out.print("El resultado de a + b es: "+sumar(a, b));
        System.out.print("El resultado de a - b es: "+resta(a, b));
        System.out.print("El resultado de a / b es: "+division(a, b));
    }
}
