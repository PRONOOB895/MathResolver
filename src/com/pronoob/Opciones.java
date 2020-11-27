package com.pronoob;

import java.util.Arrays;
import java.util.Scanner;

public class Opciones {
    private static final Scanner sc = new Scanner(System.in);
    private static int op;

    public static void ecuaciones() {
        double a, b, c;

        System.out.println("[#] Fórmula 1: ax + b = c" + "\n" + "[#] Fórmula 2: ax^2 + bx + c = 0");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();

        System.out.print("[*] Introduzca el valor de a: "); a = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de b: "); b = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de c: "); c = sc.nextDouble();
        System.out.print("[*] El valor de x es: ");

        switch (op) {
            case 1 -> System.out.println((c - b) / a);
            case 2 -> {
                double discriminant = b * b - 4 * a * c;

                if (discriminant < 0) {
                    System.out.println("NaN, NaN\n[!] La ecuacion no tiene raices reales");
                }
                else {
                    System.out.printf("%.4f%s", (-b + Math.sqrt(discriminant)) / (2 * a), ", ");
                    System.out.printf("%.4f", (-b - Math.sqrt(discriminant)) / (2 * a));
                }
            }
            default -> System.err.println("[!] Error, el rango va del 1 al 2");
        }
    }

    public static void binomioAlCuadrado() {
        double a, b;

        System.out.println("[#] Fórmula 1: (a + bx)^2" + "\n" + "[#] Fórmula 2: (a - bx)^2");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();

        System.out.print("[*] Introduzca el valor de a: "); a = sc.nextDouble();
        System.out.print("[*] Introduzca el valor de b: "); b = sc.nextDouble();

        switch (op) {
            case 1 -> System.out.printf(getFormat(a, b), "[*] El cuadrado del binomio es: ", a * a,
                    " + ", 2 * a * b, "x + ", b * b, "x^2");
            case 2 -> System.out.printf(getFormat(a, b), "[*] El cuadrado del binomio es: ", a * a,
                    " - ", 2 * a * b, "x + ", b * b, "x^2");
            default -> System.err.println("[!] Error, el rango va del 1 al 2.");
        }
    }

    public static void areasYPerimetros() {
        System.out.println("[#] Fórmula 1: Área y perímetro de un rectangulo.");
        System.out.println("[#] Fórmula 2: Área y perímetro de un triangulo.");
        System.out.println("[#] Fórmula 3: Área y circunferencia de un circulo.");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();

        switch (op) {
            case 1 -> {
                double width, height;

                System.out.print("[*] Introduzca largo del rectangulo: "); width = sc.nextDouble();
                System.out.print("[*] Introduzca ancho del rectangulo: "); height = sc.nextDouble();
                System.out.println("[*] El área del rectangulo es: " + (height * width));
                System.out.println("[*] El perímetro del rectangulo es: " + (2 * (height + width)));
            }
            case 2 -> {
                double a, b, c, perimeter;
                System.out.print("[*] Introduzca el lado 1 del triangulo: "); a = sc.nextDouble();
                System.out.print("[*] Introduzca el lado 2 del triangulo: "); b = sc.nextDouble();
                System.out.print("[*] Introduzca el lado 3 del triangulo: "); c = sc.nextDouble();
                perimeter = a + b + c;
                System.out.println("[*] El área del triangulo es: " + Math.sqrt(perimeter / 2 * (perimeter / 2 - a) * (perimeter / 2 - b) * (perimeter / 2 - c)));
                System.out.println("[*] El perimetro del triangulo es: " + perimeter);
            }
            case 3 -> {
                double r;
                System.out.print("[*] Introduzca el radio del circulo: "); r = sc.nextDouble();
                System.out.println("[*] El area del circulo es: " + (Math.PI * r * r));
                System.out.println("[*] La circunferencia del circulo es: " + (2 * Math.PI * r));
            }
            default -> System.err.println("[!] Error, el rango va del 1 al 3.");
        }
    }

    public static void calculadora() {
        System.out.println("[#] Fórmula 1: Sumar los números." + "\n" + "[#] Fórmula 2: Restar los números.");
        System.out.println("[#] Fórmula 3: Multiplicar los números: " + "\n" + "[#] Fórmula 4: Dividir los números.");
        System.out.println("[#] Förmula 5: Módulo/residuo de los números.");
        System.out.print("[*] Introduzca una opción: "); op = Integer.parseInt(sc.nextLine());

        double answer = 0;
        switch (op) {
            case 1 -> {
                System.out.print("[*] Introduzca que números desea sumar: ");

                String[] input = sc.nextLine().split(" ");

                for (String s : input) answer += Double.parseDouble(s);

                System.out.println("[*] Secuencia de números introducidos: " + Arrays.toString(input));
                System.out.println("[*] Suma de toda la secuencia: " + answer);
            }
            case 2 -> {
                System.out.print("[*] Introduzca que números desea restar: ");

                String[] input = sc.nextLine().split(" ");
                answer = Double.parseDouble(input[0]);

                for (int i = 1; i < input.length; i++) answer -= Double.parseDouble(input[i]);

                System.out.println("[*] Secuencia de números introducidos: " + Arrays.toString(input));
                System.out.println("[*] Resta de toda la secuencia: " + answer);
            }
            case 3 -> {
                System.out.print("[*] Introduzca que números desea multiplicar: ");

                String[] input = sc.nextLine().split(" ");
                answer = Double.parseDouble(input[0]);

                for (int i = 1; i < input.length; i++) answer *= Double.parseDouble(input[i]);

                System.out.println("[*] Secuencia de números introducidos: " + Arrays.toString(input));
                System.out.println("[*] Multiplicación de toda la secuencia: " + answer);
            }
            case 4 -> {
                System.out.print("[*] Introduzca que números desea dividir: ");

                String[] input = sc.nextLine().split(" ");
                answer = Double.parseDouble(input[0]);

                for (int i = 1; i < input.length; i++) answer /= Double.parseDouble(input[i]);

                System.out.println("[*] Secuencia de números introducidos: " + Arrays.toString(input));
                System.out.println("[*] División de toda la secuencia: " + answer);
            }
            case 5 -> {
                System.out.print("[*] Introduzca números para saber sus modulos: ");

                String[] input = sc.nextLine().split(" ");
                answer = Double.parseDouble(input[0]);

                for (int i = 1; i < input.length; i++) answer %= Double.parseDouble(input[i]);

                System.out.println("[*] Secuencia de números introducidos: " + Arrays.toString(input));
                System.out.println("[*] Modulo de toda la secuencia: " + answer);
            }
            default -> System.err.println("[!] Error, el rango va del 1 al 5.");
        }
    }

    public static void teoremaDePitagoras() {
        double side1, side2;

        System.out.print("[*] Introduce la longitud del primer cateto: "); side1 = sc.nextDouble();
        System.out.print("[*] Introduce la longitud del segundo cateto: "); side2 = sc.nextDouble();

        System.out.println("[*] La hipotenusa del triangulo mide: " + Math.sqrt(side1*side1 + side2*side2));
    }

    private static String getFormat(double a, double b) {
        String format = "";

        if (a == (int) a) format += "%s%.0f%s";
        else format += "%s%.2f%s";

        if (a != (int) a || b != (int) b) format += "%.2f%s";
        else format += "%.0f%s";

        if (b == (int) b) format += "%.0f%s";
        else format += "%.2f%s";

        return format;
    }
}
