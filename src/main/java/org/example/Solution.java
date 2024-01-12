package org.example;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numerador: ");
        int numerador = scanner.nextInt();
        System.out.println("Digite o denominador: ");
        int denominador = scanner.nextInt();
        Result divisor = new Result(numerador, denominador);
        divisor.imprimeFracaoSimplificada();
    }
}