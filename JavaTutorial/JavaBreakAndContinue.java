public class JavaBreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;//Se usa para salir de un bucle, deteniendolo.
            }
            System.out.println(i);
          }
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;//Se usa para continuar con una siguiente iteración interrumpiendo la actual
            }
            System.out.println(i);
        }   
    }
}
