package edu.ujcv.progra1;

public class ClaseA {

    private ArregloDi[] Aprobados;
    private ArregloDi[] queue;


    public double probabilidad(){
        double rad;
        rad = Math.random();
        return rad;
    }
    public ArregloDi[] claseA(){

         ArregloDi a = new ArregloDi();

        if(a.tamanoList()>20){
            ArregloDi[] queue = new ArregloDi[20];
        }else{
            ArregloDi[] queue = new ArregloDi[a.tamanoList()];
        }

        for (int i = 0; i < queue.length ; i++) {
            queue[i] = a.getListaDeAl(i);
        }

        for (int i = 0; i <queue.length ; i++) {
            if (probabilidad()>0.6){
                a.setClaseA(true);
                a.setContA(+1);
                Aprobados[i] = queue[i];
            }else{
                a.setClaseA(false);
                a.setContA(+1);
            }
        }
        return Aprobados;
    }

    //Getter
    public ArregloDi[] getAprobados (){
        return Aprobados;
    }

}
