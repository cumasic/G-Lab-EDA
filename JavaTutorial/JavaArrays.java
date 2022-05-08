public class JavaArrays {
    public static void main(String[] args) {
        //Los arrays se usan para alacenar varios valores de una sola variable
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//Se declaran de esta manera
        int[] myNum = {10, 20, 30, 40};//Y se tiene que espicificar el tipo del array
        System.out.println(cars[0]);//Se accede a ellos haciendo una referencia de númeor de índice
        cars[0] = "Opel";//Se puede cambiar un valor específico de una array 
        System.out.println(cars.length);//Se puede saber su longitud o cantidad del array
        for (int i = 0; i < cars.length; i++) {//Para recorrer sus elementos se usa un bucle for y se específica su longitud
            System.out.println(cars[i]);
        }
        for (String i : cars) {//Se puede utilizar el for-each para hacerlo más práctico
            System.out.println(i);
        }
        //Existen tambien las matrices multidimensionales que son matriz de matrices
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };//Se declaran de esta manera
        int x = myNumbers[1][2];//Se accede a un elemento de ellas de esta manera
        System.out.println(x);
        for (int i = 0; i < myNumbers.length; ++i) {//Aca se puede usar un bucle for dentro de otro bucle for para obtener los elementos de la matriz
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    } 
}
