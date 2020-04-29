package edu.ujcv.progra1;

import java.util.Scanner;

public class ClaseD {
    private ArregloDi[] Aprobados;
    private ArregloDi[] queue;
    private ArregloDi[] Listado;

    public double probabilidad(){
        double rad;
        rad = Math.random();
        return rad;
    }

    public ArregloDi[] claseA(){

        ClaseC a = new ClaseC();
        ArregloDi b = new ArregloDi();

        if(a.getAprobados().length>20){
            ArregloDi[] queue = new ArregloDi[20];
        }else{
            ArregloDi[] queue = new ArregloDi[a.getAprobados().length];
        }

        for (int i = 0; i < queue.length ; i++) {
            queue[i] = a.getAprobadosint(i);
        }

        for (int i = 0; i <queue.length ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("El estudiante: "+queue[i]+"\nAprueba (si/no)");
            String resp = sc.next();
            resp.toUpperCase();
            if(resp.equals("Si")){
                Aprobados[i] = queue[i];
                queue[i].removeFirst();
                b.setClaseD(true);
                b.setContC(+1);
            }else{
                b.setContC(+1);
            }
        }
        return Aprobados;
    }

    //Getter

    public ArregloDi[] getAprobados() {
        return Aprobados;
    }
    public ArregloDi getAprobadosint(int i) {
        return Aprobados[i];
    }

    public ArregloDi[] getQueue() {
        return queue;
    }
}
