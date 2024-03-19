import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // EntradaYSalida();
        //HacerCondicional();
        HacerSwitch();

    }

    public static void HacerCondicional() {
        if (18 == 19) {
            System.out.println("Error Lógico");

        } else if (10 > 11) {
            System.out.println("Error Lógico");
        } else {
            System.out.println("Todo esta bien");
        }
    }
    public static  void EntradaYSalida() {
        System.out.println("Hello and welcome!");
        Scanner ComoSea = new Scanner(System.in);
        System.out.println("Your name: ");
        String nombre = ComoSea.nextLine();
        System.out.println("Your age: ");
        int edad = ComoSea.nextInt();
        System.out.println(nombre + " " + edad);

    }

    public static void HacerSwitch() {
        Scanner ComoSea = new Scanner(System.in);
        int opcion = 0;
        float a, b;

        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Division");
        System.out.println("5. Salir");

        System.out.println("Escriba la opcion a realizar: ");
        opcion = ComoSea.nextInt();

        // Sumar, restar, multiplicar, dividir
        switch (opcion) {
            case 1:
                System.out.println("----Suma----");
                System.out.print("Ingrese el Primer numero: ");
                a = ComoSea.nextFloat();
                System.out.print("Ingrese el segundo numero: ");
                b = ComoSea.nextFloat();
                System.out.print("El resultado es " + (a+b));

                break;

            case 2:
                System.out.println("----Resta----");
                System.out.print("Ingrese el Primer numero: ");
                a = ComoSea.nextFloat();
                System.out.print("Ingrese el segundo numero: ");
                b = ComoSea.nextFloat();
                System.out.print("El resultado es " + (a-b));

                break;

            case 3:
                System.out.println("----Multiplicacion----");
                System.out.print("Ingrese el Primer numero: ");
                a = ComoSea.nextFloat();
                System.out.print("Ingrese el segundo numero: ");
                b = ComoSea.nextFloat();
                System.out.print("El resultado es " + (a*b));

                break;

            case 4:
                System.out.println("----División----");
                System.out.print("Ingrese el Primer numero: ");
                a = ComoSea.nextFloat();
                System.out.print("Ingrese el segundo numero: ");
                b = ComoSea.nextFloat();
                System.out.print("El resultado es " + (a / b));

                break;

            case 5:
                break;



        }
    }
}