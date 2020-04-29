package edu.ujcv.progra1;

public class ClaseF {

    private ArregloDi[] Aprobados;
    private ArregloDi[] queue;
    private ArregloDi[] Listado;

    public double probabilidad(){
        double rad;
        rad = Math.random();
        return rad;
    }

    public ArregloDi[] claseA(){

        ClaseE a = new ClaseE();
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
            if (probabilidad()>0.6){
                b.setClaseF(true);
                b.setContF(+1);
                Aprobados[i] = queue[i];
                queue[i].removeFirst();
            }else{
                b.setClaseF(false);
                b.setContF(+1);
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
}
