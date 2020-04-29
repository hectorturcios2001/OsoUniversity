package edu.ujcv.progra1;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArregloDi a = new ArregloDi();
        a.GenerarAlumos();
        LectorDeTeclado lc = new LectorDeTeclado();
        String mensaje = "Numero invalido reintente";
        System.out.println("\n\t\t\tMenu");
        System.out.println("1) Continuar al proximo\n2) Consultar alumnos\n3) consultar clase\n4) Evaluar ternas\n5) Salir");
        int x = lc.getInteger(mensaje);
        switch (x){
            case 1:{}
            case 2:{
                for (int i = 0; i < a.getBaseDeDatos().length ; i++) {
                    System.out.println(a.getBaseDeDatosInt(i));
                }
                break;
            }

            case 3:{break;}
            case 4:{break;}
            case 5:{break;}
        }


    }
}
