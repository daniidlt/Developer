public class Salidadedatosypractica4 {
    public static void main(String[] args) {

        /* EJERCICIO 1
        System.out.print("Daniel Del Toro Valencia");

         EJERCICIO 2
        System.out.print("Nombre: Daniel Del Toro Valencia");
        System.out.print("Dirección:Calle Las Huertas 26");
        System.out.print("Teléfono:643991647");

        EJERCICIO 3
        System.out.printf("%-10s   %-10s\n", "INGLÉS","ESPAÑOL");
        System.out.printf("%-10s   %-10s\n", "Book","Libro");
        System.out.printf("%-10s   %-10s\n", "Table","Mesa");
        System.out.printf("%-10s   %-10s\n", "Car","Coche");
        System.out.printf("%-10s   %-10s\n", "Water","Agua");
        System.out.printf("%-10s   %-10s\n", "Football","Fútbol");
        System.out.printf("%-10s   %-10s\n", "Computer","Ordenador");
        System.out.printf("%-10s   %-10s\n", "Yes","Sí");
        System.out.printf("%-10s   %-10s\n", "Good","Bien");
        System.out.printf("%-10s   %-10s\n", "House","Casa");
        System.out.printf("%-10s   %-10s\n", "Street","Calle");


        EJERCICIO 4

        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n","LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n","PROG", "PROG", "DASP", "EntDE", "IPE1");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n", "PROG", "PROG", "EntDE", "EntDE", "IPE1");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n","PROG", "PROG", "BBDD", "IPE1", "BBDD");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n","PROG", "SI", "BBDD", "IPE1", "BBDD");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n", "BBDD", "SI", "SI", "PROG", "LMSI");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n", "LMSI", "SI", "SI", "SASP", "LMSI");


        EJERCICIO 5
        String r = "\033[31m";
        String v = "\033[32m";
        String n = "\033[33m";
        String a = "\033[34m";
        String m = "\033[35m";
        String c = "\033[36m";
        String b = "\033[37m";

        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",r+"LUNES", v+"MARTES", m+"MIÉRCOLES", a+"JUEVES", c+"VIERNES");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",r+"PROG", r+"PROG", c+"DASP", v+"EntDE", v+"IPE1");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",r+"PROG", r+"PROG", v+"EntDE", v+"EntDE", v+"IPE1");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",r+"PROG", r+"PROG", n+"BBDD", v+"IPE1", n+"BBDD");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",r+"PROG", m+"SI", n+"BBDD", v+"IPE1", n+"BBDD");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",n+"BBDD", m+"SI", m+"SI", r+"PROG", a+"LMSI");
        System.out.printf("%-10s %-10s %-10s  %-10s %-10s\n",a+"LMSI", m+"SI", m+"SI", b+"SASP", a+"LMSI");

        EJERCICIO 6
        System.out.println("         *");
        System.out.println("        **");
        System.out.println("       ***");
        System.out.println("      ****");
        System.out.println("     *****");
        System.out.println("    ******");
        System.out.println("   *******");
        System.out.println("  ********");
        System.out.println(" *********");

        EJERCICIO 7
        System.out.println("         *");
        System.out.println("        *     *");
        System.out.println("       *    **");
        System.out.println("      **    **");
        System.out.println("     ***     **");
        System.out.println("    ****    **");
        System.out.println("   ****    ***");
        System.out.println("  ****   ****");
        System.out.println(" *********");

        EJERCICIO 7
        System.out.println("*********");
        System.out.println("********");
        System.out.println("*******");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        System.out.println("   **");
        System.out.println("  ||||");
        System.out.println(" <---><--->");
        System.out.println(" /_/****|_||");


        //EJERCICIO 1 PRÁTICA 4
        //Declaramos la variable int
        int c = 120;
        //Declaramos que la variable long es igual al identificador de la  variable int
        long l = c;
        System.out.println(l);

        //EJERCICIO 3 PRÁCTICA 4
        //Declaramos la variable char
        char c = 'A';
        //Sumamos 1 al valor de la variable y la guardamos en otra
        int code = c+1;
        //Imprimimos el resultado en Unicode
        System.out.println((char) code);

        //EJERCICIO 5 PRÁCTICA 4

        //Declaramos la variable
        Integer n = 10;
        //Cambiamos el tipo de variable
        int resultado = 10+n;
        //Imprimimos el resultado
        System.out.println("El resultado es:"+ resultado);


        //EJERCICIO 7 PRÁCTICA 4
        long  l = 33000L;
        short n = (short) l;
        System.out.println(l);
        System.out.println(n);

        //EJERCICIO 8 PRÁCTICA 4
        //Declaramos la variable
        int o=258;
         //Hacemos el cast
        byte a = (byte)(o);
        //Imprimimos el resultado
        System.out.println(a);

        //EJERCICIO 9 PRÁCTICA 4
        //Declaramos la variable
        int x = 66;
        //Hacemos el cast
        char c = (char) x;
        //Imprimimos el resultado
        System.out.print(c);
        */

        //EJERCICIO 10 PRACTICA 4
        //Declaramos las variables
        String entero = "149";
        String decimal = "21.5";
        //Hacemos los casts
            int precio = Integer.parseInt(entero);
            double iva = Double.parseDouble(decimal);
            //Calculamos el precio
            double total = precio * iva/100;
        //Imprimimos el resultado
            System.out.println("Precio final: " + total);



    }
}