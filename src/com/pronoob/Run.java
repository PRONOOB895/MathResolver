package com.pronoob;

import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int op;

        Locale.setDefault(Locale.US);

        System.out.println("[===========================================]");
        System.out.println("[*] 1.- Ecuaciónes. \n[*] 2.- Cuadrado de un binomio. \n[*] 3.- Áreas y Perímetros");
        System.out.println("[*] 4.- Calculadora aritmética. \n[*] 5.- Teorema de Pitagoras.");
        System.out.print("[*] Introduzca una opción: "); op = sc.nextInt();
        System.out.println();

        switch (op) {
            case 1 -> Opciones.ecuaciones();
            case 2 -> Opciones.binomioAlCuadrado();
            case 3 -> Opciones.areasYPerimetros();
            case 4 -> Opciones.calculadora();
            case 5 -> Opciones.teoremaDePitagoras();
            default -> System.err.println("[!] Error, el rango va del...");
        }
    }
}