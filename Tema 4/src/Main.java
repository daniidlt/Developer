import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //Ejercicio 1
        System.out.print("1. Lunes" +
                "\n2. Martes" +
                "\n3. Miércoles" +
                "\n4. Jueves" +
                "\n5. Viernes" +
                "\n6. Sabado" +
                "\n7. Domingo\n");
        System.out.println("Elige un día de la semana: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1: {
                System.out.println("Programación");
                break;
            }
            case 2: {
                System.out.println("Programacion");
                break;
            }
            case 3: {
                System.out.println("Digitalización");
                break;
            }
            case 4: {
                System.out.println("Entorno de desarrollo");
                break;
            }
            case 5: {
                System.out.println("IPE1");
                break;
            }
            case 6: {
                System.out.println("No hay clase");
                break;
            }
            case 7: {
                System.out.println("No hay clase");
                break;
            }
            default: {
                System.out.println("No es un día de la semana");
                break;
            }
        }

        //Ejercicio 2
        System.out.println("Dime la hora: ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        }
        else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        }
        else if (hora >= 21 && hora <= 23) {
            System.out.println("Buenas noches");
        }
        else if (hora >= 0 && hora <= 5) {
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("No es una hora del día");
        }

        //Ejercicio 3
        System.out.println("Escribe un número entre el 1 y el 7:");
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("Lunes");
                break;
            }
            case 2: {
                System.out.println("Martes");
                break;
            }
            case 3: {
                System.out.println("Miércoles");
                break;
            }
            case 4: {
                System.out.println("Jueves");
                break;
            }
            case 5: {
                System.out.println("Viernes");
                break;
            }
            case 6: {
                System.out.println("Sábado");
                break;
            }
            case 7: {
                System.out.println("Domingo");
                break;
            }
            default: {
                System.out.println("No es un día de la semana");
                break;
            }
        }
        */

        //Ejercicio 4

        System.out.println("Introduce el número de horas trabajadas:");
        int horastotal = sc.nextInt();
        int horas = 1;
        while (horas <= 40) {
          int salario = horas * 12;
          horas++;
        }
        if (horas >40) {
            int horaextra = horas * 16;
        }
            System.out.println("El dinero total es = " + salario);


    }
}