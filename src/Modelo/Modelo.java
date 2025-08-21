package Modelo;

import Clases.Asientos;
import Clases.Pelicula;
import Clases.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Modelo {



    public static List<Asientos> lstAsientos(){
        //Lista de Personal
        List<Asientos> lstAsientos = new ArrayList<>();

        lstAsientos.add(new Asientos("001","A",1));
        lstAsientos.add(new Asientos("001","A",2));
        lstAsientos.add(new Asientos("001","A",3));
        lstAsientos.add(new Asientos("001","A",4));
        lstAsientos.add(new Asientos("001","A",5));
        lstAsientos.add(new Asientos("001","A",6));
        lstAsientos.add(new Asientos("001","A",7));
        lstAsientos.add(new Asientos("001","A",8));
        lstAsientos.add(new Asientos("001","A",9));
        lstAsientos.add(new Asientos("001","A",10));

        lstAsientos.add(new Asientos("001","B",1));
        lstAsientos.add(new Asientos("001","B",2));
        lstAsientos.add(new Asientos("001","B",3));
        lstAsientos.add(new Asientos("001","B",4));
        lstAsientos.add(new Asientos("001","B",5));
        lstAsientos.add(new Asientos("001","B",6));
        lstAsientos.add(new Asientos("001","B",7));
        lstAsientos.add(new Asientos("001","B",8));
        lstAsientos.add(new Asientos("001","B",9));
        lstAsientos.add(new Asientos("001","B",10));

        lstAsientos.add(new Asientos("001","C",1));
        lstAsientos.add(new Asientos("001","C",2));
        lstAsientos.add(new Asientos("001","C",3));
        lstAsientos.add(new Asientos("001","C",4));
        lstAsientos.add(new Asientos("001","C",5));
        lstAsientos.add(new Asientos("001","C",6));
        lstAsientos.add(new Asientos("001","C",7));
        lstAsientos.add(new Asientos("001","C",8));
        lstAsientos.add(new Asientos("001","C",9));
        lstAsientos.add(new Asientos("001","C",10));

        lstAsientos.add(new Asientos("002","A",1));
        lstAsientos.add(new Asientos("002","A",2));
        lstAsientos.add(new Asientos("002","A",3));
        lstAsientos.add(new Asientos("002","A",4));
        lstAsientos.add(new Asientos("002","A",5));
        lstAsientos.add(new Asientos("002","A",6));
        lstAsientos.add(new Asientos("002","A",7));
        lstAsientos.add(new Asientos("002","A",8));
        lstAsientos.add(new Asientos("002","A",9));
        lstAsientos.add(new Asientos("002","A",10));

        lstAsientos.add(new Asientos("002","B",1));
        lstAsientos.add(new Asientos("002","B",2));
        lstAsientos.add(new Asientos("002","B",3));
        lstAsientos.add(new Asientos("002","B",4));
        lstAsientos.add(new Asientos("002","B",5));
        lstAsientos.add(new Asientos("002","B",6));
        lstAsientos.add(new Asientos("002","B",7));
        lstAsientos.add(new Asientos("002","B",8));
        lstAsientos.add(new Asientos("002","B",9));
        lstAsientos.add(new Asientos("002","B",10));

        lstAsientos.add(new Asientos("002","C",1));
        lstAsientos.add(new Asientos("002","C",2));
        lstAsientos.add(new Asientos("002","C",3));
        lstAsientos.add(new Asientos("002","C",4));
        lstAsientos.add(new Asientos("002","C",5));
        lstAsientos.add(new Asientos("002","C",6));
        lstAsientos.add(new Asientos("002","C",7));
        lstAsientos.add(new Asientos("002","C",8));
        lstAsientos.add(new Asientos("002","C",9));
        lstAsientos.add(new Asientos("002","C",10));

        lstAsientos.add(new Asientos("003","A",1));
        lstAsientos.add(new Asientos("003","A",2));
        lstAsientos.add(new Asientos("003","A",3));
        lstAsientos.add(new Asientos("003","A",4));
        lstAsientos.add(new Asientos("003","A",5));
        lstAsientos.add(new Asientos("003","A",6));
        lstAsientos.add(new Asientos("003","A",7));
        lstAsientos.add(new Asientos("003","A",8));
        lstAsientos.add(new Asientos("003","A",9));
        lstAsientos.add(new Asientos("003","A",10));

        lstAsientos.add(new Asientos("003","B",1));
        lstAsientos.add(new Asientos("003","B",2));
        lstAsientos.add(new Asientos("003","B",3));
        lstAsientos.add(new Asientos("003","B",4));
        lstAsientos.add(new Asientos("003","B",5));
        lstAsientos.add(new Asientos("003","B",6));
        lstAsientos.add(new Asientos("003","B",7));
        lstAsientos.add(new Asientos("003","B",8));
        lstAsientos.add(new Asientos("003","B",9));
        lstAsientos.add(new Asientos("003","B",10));

        lstAsientos.add(new Asientos("003","C",1));
        lstAsientos.add(new Asientos("003","C",2));
        lstAsientos.add(new Asientos("003","C",3));
        lstAsientos.add(new Asientos("003","C",4));
        lstAsientos.add(new Asientos("003","C",5));
        lstAsientos.add(new Asientos("003","C",6));
        lstAsientos.add(new Asientos("003","C",7));
        lstAsientos.add(new Asientos("003","C",8));
        lstAsientos.add(new Asientos("003","C",9));
        lstAsientos.add(new Asientos("003","C",10));

        lstAsientos.add(new Asientos("003","D",1));
        lstAsientos.add(new Asientos("003","D",2));
        lstAsientos.add(new Asientos("003","D",3));
        lstAsientos.add(new Asientos("003","D",4));
        lstAsientos.add(new Asientos("003","D",5));
        lstAsientos.add(new Asientos("003","D",6));
        lstAsientos.add(new Asientos("003","D",7));
        lstAsientos.add(new Asientos("003","D",8));
        lstAsientos.add(new Asientos("003","D",9));
        lstAsientos.add(new Asientos("003","D",10));

        lstAsientos.add(new Asientos("004","A",1));
        lstAsientos.add(new Asientos("004","A",2));
        lstAsientos.add(new Asientos("004","A",3));
        lstAsientos.add(new Asientos("004","A",4));
        lstAsientos.add(new Asientos("004","A",5));
        lstAsientos.add(new Asientos("004","A",6));
        lstAsientos.add(new Asientos("004","A",7));
        lstAsientos.add(new Asientos("004","A",8));
        lstAsientos.add(new Asientos("004","A",9));
        lstAsientos.add(new Asientos("004","A",10));

        lstAsientos.add(new Asientos("004","B",1));
        lstAsientos.add(new Asientos("004","B",2));
        lstAsientos.add(new Asientos("004","B",3));
        lstAsientos.add(new Asientos("004","B",4));
        lstAsientos.add(new Asientos("004","B",5));
        lstAsientos.add(new Asientos("004","B",6));
        lstAsientos.add(new Asientos("004","B",7));
        lstAsientos.add(new Asientos("004","B",8));
        lstAsientos.add(new Asientos("004","B",9));
        lstAsientos.add(new Asientos("004","B",10));

        lstAsientos.add(new Asientos("004","C",1));
        lstAsientos.add(new Asientos("004","C",2));
        lstAsientos.add(new Asientos("004","C",3));
        lstAsientos.add(new Asientos("004","C",4));
        lstAsientos.add(new Asientos("004","C",5));
        lstAsientos.add(new Asientos("004","C",6));
        lstAsientos.add(new Asientos("004","C",7));
        lstAsientos.add(new Asientos("004","C",8));
        lstAsientos.add(new Asientos("004","C",9));
        lstAsientos.add(new Asientos("004","C",10));

        lstAsientos.add(new Asientos("004","D",1));
        lstAsientos.add(new Asientos("004","D",2));
        lstAsientos.add(new Asientos("004","D",3));
        lstAsientos.add(new Asientos("004","D",4));
        lstAsientos.add(new Asientos("004","D",5));
        lstAsientos.add(new Asientos("004","D",6));
        lstAsientos.add(new Asientos("004","D",7));
        lstAsientos.add(new Asientos("004","D",8));
        lstAsientos.add(new Asientos("004","D",9));
        lstAsientos.add(new Asientos("004","D",10));

        return lstAsientos;
    }

}
