/**
 * Desarrollar un programa que permita generar fichas digitales de los principales monumentos de Andalucía
 * @author Daniel Del Toro Valencia
 * @since 2025-10-14
 */
import java.util.Scanner;

public class FichaMonumentosAndaluces {
    public static void main(String[] args) {
        //Declaraciones y asignaciones
        Scanner sc = new Scanner(System.in);
        final int ANIO_ACTUAL= 2025;
        final String COMUNIDAD = "Andalucia";
        final String TITULO_FICHA = "FICHA DE MONUMENTOS ANDALUCES";
        final char SIMBOLO = '€';
        final String MONEDA = "EUR";
        final float DESCUENTO_ESTUDIANTE = 0.15f;
        //Variables
        String nombre;
        String dni;
        int nacimiento;
        String codigo;
        //Monumento 1
        String monumento1; //Definimos las variables del monumento 1
        int construccion1;
        float precio1;
        //Monumento 2
        String monumento2; //Definimos las variables del monumento 2
        int construccion2;
        float precio2;
        //Monumento 3
        String monumento3; //Definimos las variables del monumento 3
        int construccion3;
        float precio3;

        //Entrada
        System.out.println("Ingrese su nombre:"); //Pedimos el nombre
        nombre = sc.nextLine(); //Lo guardamos en la variable nombre
        System.out.println("Ingrese su dni:"); //Pedimos el DNI
        dni = sc.nextLine(); //Lo guardamos en la variable dni
        System.out.println("Ingrese su año de nacimiento:"); //Pedimos el año de nacimiento
        nacimiento = sc.nextInt(); //Lo guardamos en la variable nacimiento
        sc.nextLine();
        System.out.println("Ingrese el código de ficha:"); //Pedimos el código de ficha
        codigo = sc.nextLine(); //Lo guardamos en la variable codigo
        System.out.println("Introduce el nombre del monumento 1:"); // Pedimos el nombre del monumento 1 (haremos lo mismo con el 2 y el 3)
        monumento1 = sc.nextLine(); //Lo guardamos en su variable correspondiente
        System.out.println("Año de construcción del monumento 1 :"); //Pedimos el año de construcción del monumento 1 (haremos lo mismo con el 2 y el 3)
        construccion1 = sc.nextInt();//Lo guardamos en su variable correspondiente
        System.out.println("Introduce el precio entrada del monumento 1:"); //Pedimos el precio de la entrada del primer monumento (haremos lo mismo con el 2 y el 3)
        precio1 = sc.nextFloat();//Lo guardamos en su variable correspondiente
        sc.nextLine();// Ponemos aquí un escáner porque pasamos de un float a un string
        System.out.println("Introduce el nombre del monumento 2:");
        monumento2 = sc.nextLine();
        System.out.println("Año de construcción del monumento 2 :");
        construccion2 = sc.nextInt();
        System.out.println("Introduce el precio entrada del monumento 2:");
        precio2 = sc.nextFloat();
        sc.nextLine();// Ponemos aquí un escáner porque pasamos de un float a un string
        System.out.println("Introduce el nombre del monumento 3:");
        monumento3 = sc.nextLine();
        System.out.println("Año de construcción del monumento 3 :");
        construccion3 = sc.nextInt();
        System.out.println("Introduce el precio entrada del monumento 3:");
        precio3 = sc.nextFloat();

        //Proceso
        int edad = ANIO_ACTUAL- nacimiento; //Calculamos la edad restando las dos variables y guardando el resultado en "edad"

        int antiguedad =  ANIO_ACTUAL - construccion1; //Calculamos la antiguedad del primer monumento restando las variables y las guardamos en "antiguedad", haremos lo mismo con los demás monumentos
        short edadMonumento1 = (short) antiguedad; //Pasamos del tipo int al tipo short de manera explícita
        int antiguedad2 =  ANIO_ACTUAL - construccion2;
        short edadMonumento2 = (short) antiguedad2;
        int antiguedad3 =  ANIO_ACTUAL - construccion3;
        short edadMonumento3 = (short) antiguedad3;

        float siglos = antiguedad/100.0f; //Calculamos los siglos dividiendo entre 100 la antiguedad del documento (igual con os demas monumentos)
        double sigloApro1 = siglos; //Pasamos del tipo int al tipo short de manera implícita (igual en los dos monumentos)
        float siglos2 = antiguedad2/100.0f;
        double sigloApro2 = siglos;
        float siglos3 = antiguedad3/100.0f;
        double sigloApro3 = siglos;

        double subtotal = precio1 + precio2 + precio3; //Sumamos el precio de las entradas y lo guardamos en una variable
        double descuentoEducativo = subtotal*DESCUENTO_ESTUDIANTE; //Multiplicamos el descuento sobre el subtotal y lo volvemos a guardar.
        double totalEducativo = subtotal - descuentoEducativo; //Restamos el subtotal al descuento y lo guardamos en el total

        //Salida
        System.out.println("============ FICHA DE MONUMENTOS ANDALUCES ============");
        System.out.println("Código: " + codigo + "  Comunidad: " + COMUNIDAD + "  Moneda: " + MONEDA); //Ponemos en cada línea de salida el apartado sumado a la variable o constante que guarda el resultado correspondiente.
        System.out.println("Alumno/a: "+ nombre + "("+dni+")" + "  Edad: "+edad);
        System.out.println("-------------------------------------------------------");
        System.out.println("Monumento 1: " + monumento1);
        System.out.println("Año: " + construccion1);
        System.out.println("Antiguedad: " + edadMonumento1 + " años");
        System.out.println("Siglos aprox: " + sigloApro1);
        System.out.println("Precio: " + SIMBOLO + precio1);
        System.out.println("Monumento 2: " + monumento2);
        System.out.println("Año: " + construccion2);
        System.out.println("Antiguedad: " + edadMonumento2 + "años");
        System.out.println("Siglos aprox: " + sigloApro2);
        System.out.println("Precio: " + SIMBOLO + precio2);
        System.out.println("Monumento 3: " + monumento3);
        System.out.println("Año: " + construccion3);
        System.out.println("Antiguedad: " + edadMonumento3 + "años");
        System.out.println("Siglos aprox: " + sigloApro3);
        System.out.println("Precio: " + SIMBOLO + precio3);
        System.out.println("-------------------------------------------------------");
        System.out.println("Subtotal: " + SIMBOLO + subtotal);
        System.out.println("Descuento educativo (15%): " + SIMBOLO + descuentoEducativo);
        System.out.println("TOTAL EDUCATIVO: fe" + SIMBOLO + totalEducativo);
        System.out.println("=======================================================");
        sc.close(); //Cerramos el escáner
    }
}