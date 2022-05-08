public class JavaMethods{
    /*Los métodos son bloques de código que se usan cuando son llamados
    Útiles para reutilizar los bloques de código*/ 
    static void myMetodo() {
        /*static significa que el método pertenece a la clase
        void significa que no retornara nada
        myMetodo seria el nombre*/
        System.out.println("Probando métodos");
    }
    public static void main(String[] args) {
        //Para llamar a un metodo se pone su nombre seguido de () y ;
        myMetodo();
    }
}