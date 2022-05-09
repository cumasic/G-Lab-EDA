public class JavaMethodParameters{
    //Los parámetros actúan como variables dentro del método
    static void myMethod1(String fname) {
        //En este caso fname actua como parámetro de tipo String
        System.out.println(fname + " Refsnes");
    }
    static void myMethod2(String fname, int age) {
        //Se pueden tener parárametros múltiples 
        System.out.println(fname + " is " + age);
    }
    static int myMethod3(int x) {
        return 5 + x;
        /*Tambien pueden devolvernos un valor con la palabra return,
        y cambiando el void por un dato primitivo en este caso int*/
    }
    static void checkAge(int age) {
        //Tambien podemos usar el if-else para que nos devuelva cierto valor
        if (age < 18) {
            System.out.println("Usted no tiene la edad suficiente");
      
        } else {
            System.out.println("Usted tiene la edad suficiente");
        }
      
    }
    public static void main(String[] args) {
        myMethod1("Liam");
        myMethod1("Jenny");
        myMethod1("Anja");
        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);
        System.out.println(myMethod3(5));
        checkAge(20);
        checkAge(17);
    }
}