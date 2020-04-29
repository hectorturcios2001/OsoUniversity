package edu.ujcv.progra1;

public class ClaseB {

    private ArregloDi[] Aprobados;
    private ArregloDi[] queue;
    private ArregloDi[] Listado;

    public double probabilidad(){
        double rad;
        rad = Math.random();
        return rad;
    }

    public ArregloDi[] claseA(){

        ClaseA a = new ClaseA();
        ArregloDi b = new ArregloDi();

        if(a.getAprobados().length>20){
            ArregloDi[] queue = new ArregloDi[20];
        }else{
            ArregloDi[] queue = new ArregloDi[a.getAprobados().length];
        }

        for (int i = 0; i < queue.length ; i++) {
            queue[i] = a.getAprobados(i);
        }

        for (int i = 0; i <queue.length ; i++) {
            if (probabilidad()>0.6){
                b.setClaseB(true);
                b.setContB(+1);
                Aprobados[i] = queue[i];

            }else{
                b.setClaseB(false);
                b.setContB(+1);
            }
        }
        return Aprobados;
    }

    //Getter

    public ArregloDi[] getAprobados() {
        return Aprobados;
    }
}
