public class JavaRecursion {
    //La recursividad es la técnica de hacer que una función se llame a sí misma.
    public static void main(String[] args) {
        //En este ejemplo la función sumara los valores del 1 al 10
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        /*Es importante determinar el cierre de un bucle(en este caso 0),
        sino se encontrara con el problema de bucles infinitos*/
        if (k > 0) {//Por ejemplo la condición de detencion es cuando k=0
          return k + sum(k - 1);
        } else {//Y cuando termine retornara 0 y cerrará el bucle
          return 0;
        }
    }
}
