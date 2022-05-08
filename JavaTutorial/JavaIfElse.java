public class JavaIfElse {
    public static void main(String[] args) {
        //Existen diferentes condicionales en java
        int time = 22;
        if (time < 10) {//Si esta condicion se cumple retornara este mensaje
        System.out.println("Buenos dias");
        } else if (time < 20) {//En cambio si se cumple esta otra retorna su mensaje
        System.out.println("Buenas tardes");
        } else {//Y si no se cumplen ninguna retornara este mensaje
        System.out.println("Buenas noches");
        }
    }
}
