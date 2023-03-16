package org.example;


public class Funciones {

    public  double potencia(double x, double y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }

    public  double potenciaLog(double x, double y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return potenciaLog(x * x, y / 2);
        } else {
            return x * potenciaLog(x * x, (y - 1) / 2);
        }
    }
}
