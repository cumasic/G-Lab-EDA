public class JavaSwitch {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {//Esta expresion se evalua en diferentes casos
        case 1://Los casos comprueban si son el correcto
            System.out.println("Monday");
            break;//En caso sean correctos rompen el swicth para que no evalue otros casos
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default://Si ningun caso se cumple este saldria por defecto
            System.out.println("No es un dia de la semana");
        }
    }
}
