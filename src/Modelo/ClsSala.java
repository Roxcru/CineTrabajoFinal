package Modelo;

import Clases.Asientos;
import Clases.Pelicula;
import Clases.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ClsSala {

    public static List<Sala> lstSala(){
        List<Sala> lstSalas = new ArrayList<>();
        List<Asientos> lstAsientos = new ArrayList<>();

        // lstAsientos.add(new Asientos())


        lstSalas.add(new Sala("001",
                1,
                new ArrayList<>()
        ));

        lstSalas.add(new Sala("002",
                2,
                new ArrayList<>()
        ));

        lstSalas.add(new Sala("003",
                3,
                new ArrayList<>()
        ));

        lstSalas.add(new Sala("004",
                4,
                new ArrayList<>()
        ));
        return lstSalas;
    }

    public static void mstSala(List<Sala> lstSala){
        lstSala.forEach(pelicula -> {
            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
            System.out.println(
                    "|Codigo: " + pelicula.getIdSala() + "\t" +
                            "|Sala: " + pelicula.getSala() + "|"
            );
        });
        System.out.println(
                "-------------------------------------------------------------------------------"
        );
        System.out.println("\n");
    }

    public static void insSala(List<Sala> lstSalas){
        Scanner sc1 = new Scanner(System.in);
        Sala sala = new Sala();
        try {
            sala.setIdSala(getAutCodigo(lstSalas));
            System.out.println("Registrar el numero de Sala");
            sala.setSala(sc1.nextInt());
            System.out.println("Registrar la sinopsis de la pelicula");
            lstSalas.add(sala);
            System.out.println("Se registro correctamente la sala Codigo: " + sala.getIdSala());
        }
        catch(Exception e){
            System.out.println("Por favor, ingrese un dato valido");
        }
    };

    public static void delSala(List<Sala> lstSalas){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa el codigó de pelicula que deseas eliminar");
        String idSala = sc3.nextLine();
        lstSalas.removeIf(pelicula -> pelicula.getIdSala().equals(idSala));
        System.out.println("Se elimino correctamente la pelicula, Codigo: " + idSala);
    }

    public static  String getAutCodigo(List<Sala> lstSala){
        AtomicInteger idSala = new AtomicInteger();
        lstSala.forEach(sala1 -> {
            int valSala = Integer.parseInt(sala1.getIdSala());
            if(idSala.get() < valSala){
                idSala.set(valSala);
            };
        });

        String codigo = "000" + Integer.toString((idSala.get() + 1));
        int longitud = codigo.length();
        return codigo.substring(longitud - 3, 4);
    }
}
