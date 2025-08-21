package Modelo;

import Clases.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CslPelicula {

    public static List<Pelicula> lstPelicula(){
        //Lista de Personal
        List<Pelicula> lstPersonal = new ArrayList<>();

        lstPersonal.add(new Pelicula(
                "001",
                "Volver al Futuro",
                "El adolescente Marty McFly es amigo de Doc, un científico que ha construido una máquina del tiempo. Cuando los dos prueban el artefacto, un error fortuito hace que Marty llegue a 1955, año en el que sus padres iban al instituto y todavía no se habían conocido. Después de impedir su primer encuentro, Marty deberá conseguir que se conozcan y se enamoren, de lo contrario su existencia no sería posible."));

        lstPersonal.add(new Pelicula(
                "002",
                "El padrino",
                "Don Vito Corleone es el respetado y temido jefe de una de las cinco familias de la mafia de Nueva York en los años 40. El hombre tiene cuatro hijos: Connie, Sonny, Fredo y Michael, que no quiere saber nada de los negocios sucios de su padre. Cuando otro capo, Sollozzo, intenta asesinar a Corleone, empieza una cruenta lucha entre los distintos clanes."));

        lstPersonal.add(new Pelicula(
                "003",
                "Ciudadano Kane",
                "Un periodista se obsesiona con comprender el significado de la última palabra que Charles Foster Kane dijo antes de morir: rosebud. Para descubrir el misterio investiga a varias personas del pasado del magnate."));


        lstPersonal.add(new Pelicula(
                "004",
                "Matrix",
                "El programador informático Thomas Anderson, más conocido en el mundo de los \"hacker\" como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco."));

        return lstPersonal;
    }

    public static void mstPelicula(List<Pelicula> lstPeliculas){
        lstPeliculas.forEach(pelicula -> {
            System.out.println(
                    "-------------------------------------------------------------------------------"
            );
            System.out.println(
                    "|Codigo: " + pelicula.getIdPelicula() + "\t" +
                            "|Titulo: " + pelicula.getTitulo() + "|"
            );
            System.out.println(
                    "|Sinopsis: " + pelicula.getDescripcion() + "|"
            );
        });
        System.out.println(
                "-------------------------------------------------------------------------------"
        );
        System.out.println("\n");
    }

    public static void insPelicula(List<Pelicula> lstPeliculas){
        Scanner sc1 = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();
       try {
           pelicula.setIdPelicula(getAutCodigo(lstPeliculas));
           System.out.println("Registrar el titulo de la Pelicula");
           pelicula.setTitulo(sc1.nextLine());
           System.out.println("Registrar la sinopsis de la pelicula");
           pelicula.setDescripcion(sc1.nextLine());
           //System.out.println(pelicula.getIdPelicula());
           lstPeliculas.add(pelicula);
           System.out.println("Se registro correctamente la pelicula Codigo: " + pelicula.getIdPelicula());
        }
        catch(Exception e){
            System.out.println("Por favor, ingrese un dato valido");
        }
    };

    public static void delPelicula(List<Pelicula> lstPeliculas){
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa el codigó de pelicula que deseas eliminar");
        String idPelicula = sc3.nextLine();
        lstPeliculas.removeIf(pelicula -> pelicula.getIdPelicula().equals(idPelicula));
        System.out.println("Se elimino correctamente la pelicula, Codigo: " + idPelicula);
    }

    public static  String getAutCodigo(List<Pelicula> lstPeliculas){
        AtomicInteger idPelicula = new AtomicInteger();
        lstPeliculas.forEach(pelicula1 -> {
            int valPelicula = Integer.parseInt(pelicula1.getIdPelicula());
            if(idPelicula.get() < valPelicula){
                idPelicula.set(valPelicula);
            };
        });

        String codigo = "000" + Integer.toString((idPelicula.get() + 1));
        int longitud = codigo.length();
        return codigo.substring(longitud - 3, 4);
    }
}
