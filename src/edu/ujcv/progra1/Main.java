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
            case 1:{
                a.GenerarAlumos();
            }
            case 2:{
                for (int i = 0; i < a.getBaseDeDatos().length ; i++) {
                    System.out.println(a.getBaseDeDatosInt(i));
                }
                break;
            }

            case 3:{
                System.out.println("Que clase desea ver\n\n1)Clase A\n2)Clase B\n3)Clase C\n4)Clase D\n4)Clase E\n4)Clase F\n4)Clase G");
                x = lc.getInteger(mensaje);
                switch (x){
                    case 1:{
                        ClaseA claseA = new ClaseA();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }
                    }
                    case 2:{
                        ClaseB claseA = new ClaseB();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }}
                    case 3:{
                        ClaseC claseA = new ClaseC();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }
                    }
                    case 4:{
                        ClaseD claseA = new ClaseD();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }
                    }
                    case 5:{
                        ClaseE claseA = new ClaseE();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }}
                    case 6:{
                        ClaseF claseA = new ClaseF();
                        if(claseA.getAprobados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getAprobados());
                        }}
                    case 7:{
                        ClaseG claseA = new ClaseG();
                        if(claseA.getGaduados().length == 0){
                            System.out.println("No hubieron aprobados");
                        }else{
                            System.out.println(claseA.getGaduados());
                        }}
                }
                break;}
            case 4:{
                System.out.println("Que clase desea evaluar?\n1) Clase D\nClase G");
                int resp = lc.getInteger(mensaje);
                if (resp == 1) {
                    ClaseD cl = new ClaseD();
                    if (cl.getQueue().length == 0) {
                        System.out.println("No hay alumnos los cuales evaluar");
                    } else {
                        cl.claseA();
                    }
                }else{
                    ClaseG cl = new ClaseG();
                    if (cl.getQueue().length == 0) {
                        System.out.println("No hay alumnos los cuales evaluar");
                    } else {
                        cl.claseA();
                    }
                }
                break;}

            case 5:{break;}
        }


    }
}
