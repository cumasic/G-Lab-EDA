public class JavaTypeCasting {
    public static void main(String[] args) {
        //Existe el Widening Casting que convierte un tipo de dato primitivo en uno de mayor tamaño
        int myInt1 = 9;
        double myDouble1 = myInt1;
        System.out.println(myInt1);      
        System.out.println(myDouble1);
        //Existe el Narrowing Casting que convierte un tipo de dato primitivo en uno de menor tamaño
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; 
        System.out.println(myDouble2);   
        System.out.println(myInt2);      
    }
}
