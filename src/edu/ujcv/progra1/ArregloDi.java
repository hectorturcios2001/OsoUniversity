package edu.ujcv.progra1;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ArregloDi {

    private int size;
    private ArregloDi[] ListaDeAl;
    private ArregloDi[] BaseDeDatos;
    private ArregloDi[] AlumosExpulsados;
    boolean claseA = false;boolean claseB = false;boolean claseC = false;boolean claseD = false;boolean claseE = false;boolean claseF = false;boolean claseG = false;

    int contA=0;
    int contB=0;
    int contC=0;
    int contD=0;
    int contE=0;
    int contF=0;
    int contG=0;

    private String nombre;
    private int numeroDecuenta;
    private Random rd;
    List<String> Nombres;
    List<String> Apeliidos;

    //Metodos
    public ArregloDi[] GenerarAlumos(){
        List<String> Nombres = new ArrayList<String>();
        List<String> Apeliidos = new ArrayList<String>();
        Random rd = new Random();
        Nombres.add("Juancho");
        Nombres.add("Juan");Nombres.add("Pedro");Nombres.add("Kiana");Nombres.add("Hector");Nombres.add("Marie");Nombres.add("Ariel");Nombres.add("Gabriel");Nombres.add("Ana");Nombres.add("Miguel");Nombres.add("Andre");Nombres.add("Carlos");Nombres.add("Andrea");Nombres.add("Eliza");Nombres.add("Jorge");Nombres.add("Benito");Nombres.add("Ramon");Nombres.add("Esteban");Nombres.add("Andres");Nombres.add("Alejandro");
        Apeliidos.add(" Varela");Apeliidos.add(" Gomez");Apeliidos.add(" Dias");Apeliidos.add(" Castro");Apeliidos.add(" Pelgrim");Apeliidos.add(" Turcios");Apeliidos.add(" Valldares");Apeliidos.add(" Guifarro");Apeliidos.add(" Barrera");Apeliidos.add(" Martiz");Apeliidos.add(" Padilla");Apeliidos.add(" Casco");Apeliidos.add(" Cantor");Apeliidos.add(" Ulloa");Apeliidos.add(" Romero");Apeliidos.add(" Juarez");Apeliidos.add(" Castillo");Apeliidos.add(" Baquedano");Apeliidos.add(" Betancure");Apeliidos.add(" Manzanares");Apeliidos.add(" Holfman");
        int cont = 1;
        int ano = 2019;
        int Z = rd.nextInt(20+1);
        for (int i = 0; i < Z; i++) {
            ListaDeAl[i] = new ArregloDi(Nombres.get(rd.nextInt(21))+""+Apeliidos.get(rd.nextInt(21)),cont);
        }
        BaseDeDatos = ListaDeAl;
        return ListaDeAl;
    }
    public static ArregloDi[] remueveElement(ArregloDi[] arrayObjetos, int i) {
        System.arraycopy(arrayObjetos, i + 1, ArregloDi[],i, arrayObjetos.length - 1 - i);
        return arrayObjetos;
    }

    //Contructores
    public ArregloDi(String nombre,int numerDecuenta){
        this.nombre = nombre;
        this.numeroDecuenta = numerDecuenta;
        this.claseA = false;this.claseB = false;this.claseC = false;this.claseD = false;this.claseE = false;this.claseF = false;this.claseG = false;
        this.contA = contA;this.contB = contB;this.contC = contC;this.contD = contD;this.contE = contE;this.contF = contF;this.contG = contG;
    }
    public ArregloDi(){}


    //Setter
    public void setClaseA(boolean claseA) {
        this.claseA = claseA;
    }
    public void setContA(int contA) {
        this.contA = contA;
    }
    //Getter
    public ArregloDi getListaDeAl(int x) {
        return ListaDeAl[x];
    }

    public int tamanoList() {
        return ListaDeAl.length;
    }

    public ArregloDi getBaseDeDatosInt(int x) {
        return BaseDeDatos[x];
    }
    public ArregloDi[] getBaseDeDatos() {
        return BaseDeDatos;
    }
}
