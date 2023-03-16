package org.example;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public  void dameValor() {
        System.out.println("Introduce un valor para x: ");
        double x = sc.nextInt();
        System.out.println("Introduce un valor para y: ");
        double y = sc.nextInt();
        Funciones f = new Funciones();
       double pontecias =  f.potencia(x, y);
        System.out.println(x + " elevado a " + y + " es " + pontecias);
    }

    public void dameValor2(){
        System.out.println("Introduce un valor para x: ");
        double x = sc.nextInt();
        System.out.println("Introduce un valor para y: ");
        double y = sc.nextInt();
        Funciones f = new Funciones();
      // double pontecias2 =  f.potenciaLog(x, y);
        //System.out.println(x + " elevado a " + y + " es " + pontecias2);
    }
    public void menu() {
        int opcion;
        do {
            System.out.println("1. Potencia");
            System.out.println("2. Potencia log");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    dameValor();
                    break;
                case 2:
                   // dameValor2();
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
    }
}
