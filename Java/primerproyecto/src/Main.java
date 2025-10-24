import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int p;
        int q;
        int i;
        int suma = 0;
        IO.println("Escribe un numero:");
        Scanner input= new Scanner(System.in);
        p = input.nextInt();

        IO.println("Escribe un numero;");
        Scanner inpute= new Scanner(System.in);
        q = inpute.nextInt();
        do {
            i = p;
            suma = i + suma;
            i++;
        } while (i>=q);
        IO.println("El resultado es:" + suma);
    }
    }


