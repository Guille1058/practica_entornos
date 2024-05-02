package optimizaciónrefactorizacion;

public class e2 {

    private static int numero1,numero2,resultado;
    
    public e2() {
        numero1=0;
        numero2=0;
        resultado=0;   
    }
  
  public static void main(String[] args) {
        setNumero1(2); setNumero2(3);     //Que solo haya dos variables (numero1 y numero2)
        setResultado(getNumero1() + getNumero2());    //Que solo haya una variable de "resultado"
    System.out.println("La suma de "+getNumero1()+" y "+getNumero2()+" es "+getResultado());
        setNumero1(4); setNumero2(5);
        setResultado(getNumero1() + getNumero2());
    System.out.println("La suma de "+getNumero1()+" y "+getNumero2()+" es "+getResultado());
        setNumero1(6); setNumero2(7);
        setResultado(getNumero1() + getNumero2());
    System.out.println("La suma de "+getNumero1()+" y "+getNumero2()+" es "+getResultado());
  }

    /**
     * @return the numero1
     */
    public static int getNumero1() {
        return numero1;
    }

    /**
     * @param aNumero1 the numero1 to set
     */
    public static void setNumero1(int aNumero1) {
        numero1 = aNumero1;
    }

    /**
     * @return the numero2
     */
    public static int getNumero2() {
        return numero2;
    }

    /**
     * @param aNumero2 the numero2 to set
     */
    public static void setNumero2(int aNumero2) {
        numero2 = aNumero2;
    }

    /**
     * @return the resultado
     */
    public static int getResultado() {
        return resultado;
    }

    /**
     * @param aResultado the resultado to set
     */
    public static void setResultado(int aResultado) {
        resultado = aResultado;
    }
  
}
//La idea es reciclar las variables lo máximo posible para optimizar código(ahorrar memoria).