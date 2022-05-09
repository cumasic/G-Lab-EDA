public class JavaScope {
    /*El alcance de java se refiere a java puede 
    acceder a variables dentro de la region en que se crearon*/
    public static void main(String[] args) {
        //El ambito de bloque se refiere a lo que esta entre {} y solo se accede a variables declaradas en estos
        //Por ejemplo en esta linea el codigo no puede acceder a x
        int x = 100;
        //Pero a partir de esta si que puede acceder a x
        System.out.println(x);
    }
    //Fuera de los {} tampoco podría acceder a x
}
