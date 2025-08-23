package Modelo;

import Clases.Asientos;
import Clases.Funcion;
import Clases.Pelicula;
import Clases.Sala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ClsFuncion {
    public static List<Funcion> lstFuncion(){
        List<Funcion> lstFuncion = new ArrayList<>();

        lstFuncion.add(new Funcion("001"
                ,"001"
                ,"001"
                ,"20/08/2025"
                ,"04:00 pm"
        ));
        lstFuncion.add(new Funcion("002"
                ,"002"
                ,"001"
                ,"20/08/2025"
                ,"06:00 pm"
        ));
        lstFuncion.add(new Funcion("003"
                ,"003"
                ,"002"
                ,"20/08/2025"
                ,"04:50 pm"
        ));
        lstFuncion.add(new Funcion("004"
                ,"004"
                ,"002"
                ,"20/08/2025"
                ,"10:00 pm"
        ));
        return lstFuncion;
    }

    public static void mstFuncion(List<Funcion> lstFuncion, List<Pelicula> lstPelicula, List<Sala> lstSala){
        lstFuncion.forEach(funcion -> {
            Pelicula pelicula1 = new Pelicula();
            pelicula1 = lstPelicula.stream()
                    .filter(p->p.getIdPelicula().equals(funcion.getIdPelicula()))
                    .findFirst()
                    .orElse(null);
            String titulo = "";
            if(pelicula1 != null) titulo = pelicula1.getTitulo();


            Sala sala1 = new Sala();
            sala1 = lstSala.stream()
                    .filter(p->p.getIdSala().equals(funcion.getIdSala()))
                    .findFirst()
                    .orElse(null);
            int sala = 0;
            if(sala1 != null) sala = sala1.getSala();

            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
            System.out.println(
                    "|Codigo: " + funcion.getIdFuncion() + "\t" +
                    "|Pelicula: " + titulo + "\t" +
                    "|Sala: N°" + sala + "\t" +
                    "|Fecha:" + funcion.getFecha() +  "\t" +
                    "|Hora:" + funcion.getHorario() +"|"
            );
        });
        System.out.println(
                "-------------------------------------------------------------------------------"
        );
        System.out.println("\n");
    }

    public static void programarFuncion(List<Funcion> lstFuncion, List<Pelicula> lstPelicula, List<Sala> lstSala){
        Funcion funcion = new Funcion();
        Scanner sc1 = new Scanner(System.in);
        try {
            funcion.setIdFuncion(getAutCodigo(lstFuncion));
            System.out.println("Elegir Pelicula:");
            lstPelicula.forEach(pelicula -> {
                System.out.println("(" + pelicula.getIdPelicula()+ ")-" + pelicula.getTitulo());
            });
            funcion.setIdPelicula(sc1.nextLine());
            System.out.println("Elegir Sala:");
            lstSala.forEach(sala -> {
                System.out.println("(" + sala.getIdSala()+ ")- Sala N° " + sala.getSala());
            });
            funcion.setIdSala(sc1.nextLine());
            System.out.println("Registrar la fecha:");
            funcion.setFecha(sc1.nextLine());
            System.out.println("Registrar la hora:");
            funcion.setHorario(sc1.nextLine());
            lstFuncion.add(funcion);
            System.out.println("Se registro correctamente la sala Codigo: " + funcion.getIdFuncion());
        }
        catch(Exception e){
            System.out.println("Por favor, ingrese un dato valido");
        }
    }

    public static  String getAutCodigo(List<Funcion> lstFuncion){
        AtomicInteger idFuncion = new AtomicInteger();
        lstFuncion.forEach(sala1 -> {
            int valSala = Integer.parseInt(sala1.getIdFuncion());
            if(idFuncion.get() < valSala){
                idFuncion.set(valSala);
            };
        });

        String codigo = "000" + Integer.toString((idFuncion.get() + 1));
        int longitud = codigo.length();
        return codigo.substring(longitud - 3, 4);
    }
}
