/**
 * @author Daniel Del Toro Valencia
 * @since 2025-10-09
 * Programa de calculo de factura en base a la entrada del usuario
 */
import java.util.Scanner;

public class Preparacionexamen {
    public static void main(String[] args) {
        //Declaraciones y asignaciones
        Scanner sc = new Scanner(System.in);
            final double IVA = 0.21;
            final double ENVIO_FIJO = 4.50;
            final int ANIO_ACTUAL = 2025;
            final String MONEDA = "EUR";
            final char SIMBOLO = '€';
            //Variables
            Scanner sc = new Scanner(System.in);
            int nacimiento;
            String dni, nombre, codigo;
            String descripcion_articulo1, descripcion_articulo2, descripcion_articulo3;
            int cantidad_articulo1, cantidad_articulo2, cantidad_articulo3;
            float precio_unitario1, precio_unitario2, precio_unitario3;
       //Entrada
            System.out.println("Introduce tu nombre: ");
                 nombre = sc.nextLine();
            System.out.println("Introduce tu DNI/NIF:");
                 dni = sc.nextLine();
            System.out.println("Introduce tu año de nacimiento:");
                 nacimiento = sc.nextInt();
            System.out.println("Introduce el código de pedido:");
                 codigo = sc.nextLine();
            System.out.println("Introduce la descripción del artículo 1:");
                 descripcion_articulo1 = sc.nextLine();
            System.out.println("Introduce la cantidad del artículo 1:");
                 cantidad_articulo1 = sc.nextInt();
            System.out.println("Precio unitario del artículo 1 (EUR) 1:");
                 precio_unitario1 = sc.nextInt();
            System.out.println("Introduce la descripción del artículo 2:");
                 descripcion_articulo2 = sc.nextLine();
            System.out.println("Introduce la cantidad del artículo 2:");
                 cantidad_articulo2 = sc.nextInt();
            System.out.println("Precio unitario del artículo 2 (EUR):");
                 precio_unitario2 = sc.nextInt();
            System.out.println("Introduce la descripción del artículo 3:");
                 descripcion_articulo3 = sc.nextLine();
            System.out.println("Introduce la cantidad del artículo 3:");
                 cantidad_articulo3 = sc.nextInt();
            System.out.println("Precio unitario del artículo 3 (EUR):");
                 precio_unitario3 = sc.nextInt();

        //Proceso
        int anioedad = ANIO_ACTUAL - nacimiento;
        short edad = (short) anioedad;
        double importe1 = cantidad_articulo1 * precio_unitario1;
        double importe2 = cantidad_articulo2 * precio_unitario2;
        double importe3 = cantidad_articulo3 * precio_unitario3;

        double subtotal = importe1 + importe2 + importe3;
        double ivaEur = subtotal*IVA;
        double total = subtotal + ivaEur + ENVIO_FIJO;

        //Salida
        System.out.println("=================FACTURA=================");
        System.out.println("Pedido:"+codigo+          "Moneda:"+MONEDA);
        System.out.println("Cliente:"+nombre +"("+dni+")"+    "Edad:"+edad);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Item 1:+"+descripcion_articulo1);
        System.out.println("Cantidad:"+cantidad_articulo1+ "Precio:"+precio_unitario1+ "Importe:"+importe1);
        System.out.println("Item 2:+"+descripcion_articulo2);
        System.out.println("Cantidad:"+cantidad_articulo2+ "Precio:"+precio_unitario2+ "Importe:"+importe2);
        System.out.println("Item 3:+"+descripcion_articulo3);
        System.out.println("Cantidad:"+cantidad_articulo3+ "Precio:"+precio_unitario3+ "Importe:"+importe3);
        System.out.println("------------------------------------------------------------------");
        System.out.println("Subtotal:"+subtotal);
        System.out.println("IVA (21%)"+ivaEur);
        System.out.println("Envío:"+ENVIO_FIJO);
        System.out.println("Total:"+total);
        System.out.println("------------------------------------------------------------------");

    }
}