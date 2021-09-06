package com.Camilo.CuadradoPerfecto;

public class EjercicioCuadradoPerfecto {

    public static boolean isSquare(int n) {

        double a = n;
        int b = (int) Math.sqrt(a);
        return b * b == a;
    }
}
