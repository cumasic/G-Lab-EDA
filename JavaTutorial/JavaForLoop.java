public class JavaForLoop {
    public static void main(String[] args) {
        //El bucle for se usa cuando se sabe el número exacto de repeticiones
        for (int i = 0; i < 5; i++) {
            /*//Este contiene 3 declaraciones
            La declaración 1 se ejecuta antes de ejecutar el bloque
            La declaración 2 define la condición
            La declaración 3 se ejecuta despues de la ejecución del bloque*/
            System.out.println(i);
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //Existe un tambien un for-each pero es exclusivamente para recorrer Array
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
