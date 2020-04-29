package edu.ujcv.progra1;

public class ClaseA {

    private ArregloDi[] Aprobados;
    private ArregloDi[] queue;
    private ArregloDi[] Listado;


    public double probabilidad(){
        double rad;
        rad = Math.random();
        return rad;
    }
    public ArregloDi[] claseA(){

         ArregloDi a = new ArregloDi();

        if(a.tamanoList()>20){
            ArregloDi[] queue = new ArregloDi[a.tamanoList()];
            ArregloDi[] Listado = new ArregloDi[20];
            for (int i = 0; i < queue.length ; i++) {
                queue[i] = a.getListaDeAl(i);
            }

            for (int i = 0; i < 20 ; i++) {
                Listado[i] = queue[i];
            }
        }else{
            ArregloDi[] Listado = new ArregloDi[a.tamanoList()];
            for (int i = 0; i < Listado.length ; i++) {
                Listado[i] = a.getListaDeAl(i);
            }

        }

        for (int i = 0; i < Listado.length; i++) {
            if (probabilidad()>0.6){
                a.setClaseA(true);
                a.setContA(+1);
                Aprobados[i] = Listado[i];
                queue[i].removeFirst();
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
    public ArregloDi getAprobados (int x){
        return Aprobados[x];
    }

}
