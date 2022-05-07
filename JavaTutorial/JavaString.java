public class JavaString {
    public static void main(String[] args) {
        String txt = "Hola Mundo";//Se declara un string con "" y dentro la palabra
        System.out.println("El largo del string txt es:" + txt.length());//Se puede medir su largo con length()
        System.out.println(txt.toUpperCase());//Cambiar a MAYÚSCULAS
        System.out.println(txt.toLowerCase());//Cambiar a minúsculas
        System.out.println(txt.indexOf("Mundo"));//Buscar una palabra
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);//Concatenar Strings
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);//No confundir con operaciones pues se suman las palabras dando 1020
        String text = "Los conocidos como \"Vikingos\"eran peligrosos";//Para poner algo en comillas o comillas dobles es necesario poner \ entre la palabra seleccionada
    }
}
