public class JavaWhileLoop {
    public static void main(String[] args) {
        //Existen ciclos en java 
        int i = 0;
        while (i < 5) {//El ciclo while recorre un bloque siempre que una condición sea verdadera
        System.out.println(i);
        i++;
        }
        do {//El ciclo do-while tambien recorre un bloque pero primero ejecuta 1 vez el bloque antes de confirmar la condición
            System.out.println(i);
            i++;
        }
        while (i < 5);
        
    }
}
