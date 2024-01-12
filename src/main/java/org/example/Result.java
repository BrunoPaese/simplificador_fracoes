package org.example;

public class Result {

    private int numerador;
    private int denominador;

    public Result(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    private int determinaMenorNumero() {
        if (numerador < denominador) {
            return numerador;
        } else return denominador;
    }

    public int determinaMmc() {
        for (int i = 2; i <= determinaMenorNumero(); i++) {
            if (numerador % i == 0 && denominador % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void divisao() {
        int mmc = determinaMmc();
        numerador /= mmc;
        denominador /= mmc;
    }
    
    public void simplifica() {
        boolean simplificou = true;
        while (simplificou) {
            if (determinaMmc() != 1) {
                divisao();
            } else {
                simplificou = false;
            }
        }
    }

    public void imprimeFracaoSimplificada() {
        simplifica();
        if (denominador == 1) {
            System.out.println(numerador);
        } else {
            System.out.println(numerador + "/" + denominador);
        }
    }



}
