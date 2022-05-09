public class JavaMethodOverloading {
    //Se puede sobrecargar un método poniendo el mismo nombre y diferentes tipos de parámetros 
    static int plusMethod(int x, int y) {
        //En este caso los 2 parámetros son int
        return x + y;
    }
      
    static double plusMethod(double x, double y) {
        //Y en este caso los 2 parámetros son double
        return x + y;
    }
      
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
